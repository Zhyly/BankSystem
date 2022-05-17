package edu.fjnu501.controller;

import edu.fjnu501.domain.Customer;
import edu.fjnu501.domain.Result;
import edu.fjnu501.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping(value = {"/file"})
@CrossOrigin(origins = "*", maxAge = 3600)
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/avatar")
    @ResponseBody
    public Result downloadAvatar(int uid, MultipartFile avatarImg, HttpServletRequest request) {
        try {
            String path = request.getSession().getServletContext().getRealPath("/") + "avatar\\";
            UUID uuid = UUID.randomUUID();
            String[] src = avatarImg.getOriginalFilename().split("\\.");
            String suffix = src[src.length - 1];
            String fileName = uuid + "." + suffix;
            avatarImg.transferTo(new File(path + fileName));
            // 保存UUID至数据库
            Customer customer = new Customer();
            customer.setUid(uid);
            customer.setUuid(fileName);
            fileService.saveAvatarImgName(customer);
        } catch (Exception e) {
            return new Result(500, "更新头像失败", null);
        }
        return new Result(200, "更新头像成功", null);
    }

    @RequestMapping(value = {"/avatar/get/{uid}"})
    @ResponseBody
    public Result getAvatarByUid(@PathVariable(value = "uid") int uid) {
        String uuid = null;
        try {
            uuid = fileService.getUUID(uid);
        } catch (Exception e) {
            return new Result(500, "获取头像失败", null);
        }
        return new Result(200, "获取头像成功", uuid);
    }

}

package edu.fjnu501.controller;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.Page;
import edu.fjnu501.domain.Result;
import edu.fjnu501.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = {"/page"})
public class PageController {

    @Autowired
    private PageService pageService;

    @RequestMapping(value = "/order")
    @ResponseBody
    public Result orderPage(@RequestBody Page page) {
        try {
            return new Result(200, "获取成功", pageService.getOrderInfoByPage(page));
        } catch (Exception e) {
            return new Result(500, "获取失败", null);
        }
    }

    @RequestMapping(value = "/card")
    @ResponseBody
    public Result getCardPage(@RequestBody Page page) {
        try {
            return new Result(200, "获取成功", pageService.getCardInfoByPage(page));
        } catch (Exception e) {
            return new Result(500, "获取失败", null);
        }
    }

}

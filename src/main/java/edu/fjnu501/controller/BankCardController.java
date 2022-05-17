package edu.fjnu501.controller;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Result;
import edu.fjnu501.service.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/card")
public class BankCardController {

    @Autowired
    private BankCardService bankCardService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public Result addBankCard(@RequestBody BankCard bankCard) {
        try {
            bankCardService.addBankCard(bankCard);
        } catch (Exception e) {
            return new Result(500, "添加失败", null);
        }
        return new Result(200, "更新成功", null);
    }

    @RequestMapping(value = "/get/{uid}")
    @ResponseBody
    public Result getBankCardsByUid(@PathVariable(value = "uid") int uid) {
        List<BankCard> bankCards = null;
        try {
            bankCards = bankCardService.getBankCards(uid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500, "获取失败", null);
        }
        return new Result(200, "获取成功", bankCards);
    }

    @RequestMapping(value = "/del/{cid}")
    @ResponseBody
    public Result deleteBankCard(@PathVariable(value = "cid") int cid) {
        try {
            bankCardService.deleteCard(cid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500, "删除失败", null);
        }
        return new Result(200, "删除成功", null);
    }

}

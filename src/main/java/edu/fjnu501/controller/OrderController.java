package edu.fjnu501.controller;

import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.Result;
import edu.fjnu501.domain.TransferOrder;
import edu.fjnu501.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public Result transaction(@RequestBody Order order) {
        try {
            orderService.addOrderInfo(order);
        } catch (RuntimeException e) {
            return new Result(400, e.getMessage(), null);
        }
        return new Result(200, "交易成功", null);
    }

    @RequestMapping(value = "/get/{uid}")
    @ResponseBody
    public Result getAllOrdersByUid(@PathVariable(value = "uid") int uid) {
        List<Order> orders = null;
        try {
            orders = orderService.getAllOrdersByUid(uid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500, "获取失败", null);
        }
        return new Result(200, "获取成功", orders);
    }

    @RequestMapping(value = "/transfer")
    @ResponseBody
    public Result transferToAnotherCard(@RequestBody TransferOrder transferOrder) {
        try {
            orderService.transferBalance(transferOrder);
        } catch (Exception e) {
            return new Result(500, "转账失败, 余额不足！", null);
        }
        return new Result(200, "转账成功", null);
    }

}

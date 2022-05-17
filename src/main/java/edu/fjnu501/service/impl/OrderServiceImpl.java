package edu.fjnu501.service.impl;

import edu.fjnu501.bankenum.Trade;
import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.TransferOrder;
import edu.fjnu501.mapper.OrderMapper;
import edu.fjnu501.service.BankCardService;
import edu.fjnu501.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private BankCardService bankCardService;

    @Override
    public void addOrderInfo(Order order) {
        // 添加订单信息
        orderMapper.addOrderInfo(order);
        // 更新卡中的余额
        bankCardService.updateBalance(order);
    }

    @Override
    public List<Order> getAllOrdersByUid(int uid) {
        List<Order> orders = orderMapper.getAllOrdersByUid(uid);
        return orders;
    }

    @Override
    public void transferBalance(TransferOrder transferOrder) {
        Order srcOrder = new Order();
        srcOrder.setCid(transferOrder.getSrcCid());
        srcOrder.setType(Trade.withdraw.getType());
        srcOrder.setAmount(transferOrder.getAmount());
        srcOrder.setUid(transferOrder.getUid());

        Order distOrder = new Order();
        distOrder.setCid(transferOrder.getDistCid());
        distOrder.setType(Trade.save.getType());
        distOrder.setAmount(transferOrder.getAmount());
        distOrder.setUid(transferOrder.getUid());

        orderMapper.addOrderInfo(srcOrder);
        orderMapper.addOrderInfo(distOrder);

        bankCardService.updateBalance(srcOrder);
        bankCardService.updateBalance(distOrder);
    }

}

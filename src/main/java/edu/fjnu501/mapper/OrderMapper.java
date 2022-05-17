package edu.fjnu501.mapper;

import edu.fjnu501.domain.Order;

import java.util.List;

public interface OrderMapper {

    void addOrderInfo(Order order);

    List<Order> getAllOrdersByUid(int uid);

}

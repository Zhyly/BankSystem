package edu.fjnu501.service;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.Page;

import java.util.List;

public interface PageService {

    List<Order> getOrderInfoByPage(Page page);

    List<BankCard> getCardInfoByPage(Page page);

}

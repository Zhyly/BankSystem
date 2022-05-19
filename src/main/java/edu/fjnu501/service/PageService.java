package edu.fjnu501.service;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.Page;

import java.util.List;

public interface PageService {

    Page getOrderInfoByPage(Page page);

    Page getCardInfoByPage(Page page);

}

package edu.fjnu501.service;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;

import java.util.List;

public interface BankCardService {

    List<BankCard> getBankCards(int uid);

    void addBankCard(BankCard bankCard);

    void updateBalance(Order order);

    void deleteCard(int cid);

    double findBalance(int cid);

    int findUidByCid(int cid);

}

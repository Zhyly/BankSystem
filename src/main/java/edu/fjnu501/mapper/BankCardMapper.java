package edu.fjnu501.mapper;

import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;

import java.util.List;

public interface BankCardMapper {

    void addBankCard(BankCard bankCard);

    List<BankCard> findBankCardsByUid(int uid);

    void updateBalance(Order order);

    void deleteCard(int cid);

    double findBalance(int cid);

    int findUidByCid(int cid);

}

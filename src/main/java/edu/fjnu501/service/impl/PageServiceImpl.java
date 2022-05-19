package edu.fjnu501.service.impl;

import com.github.pagehelper.PageHelper;
import edu.fjnu501.domain.BankCard;
import edu.fjnu501.domain.Order;
import edu.fjnu501.domain.Page;
import edu.fjnu501.mapper.BankCardMapper;
import edu.fjnu501.mapper.OrderMapper;
import edu.fjnu501.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pageService")
public class PageServiceImpl implements PageService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private BankCardMapper bankCardMapper;

    @Override
    public List<Order> getOrderInfoByPage(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return orderMapper.getAllOrdersByUid(page.getUid());
    }

    @Override
    public List<BankCard> getCardInfoByPage(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return bankCardMapper.findBankCardsByUid(page.getUid());
    }
}

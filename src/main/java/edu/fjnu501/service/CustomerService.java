package edu.fjnu501.service;

import edu.fjnu501.domain.Customer;

import java.text.ParseException;

public interface CustomerService {

    // 通过UID获取客户信息
    Customer getCustomerInfoByUid(int uid);

    // 注册账号
    String registerAccount(Customer customer) throws ParseException;

    // 登录后获取信息
    void getUserInfoAfterLogin(Customer customer);

    void updateInfo(Customer customer);

    boolean checkIdentityNumber(Customer customer);

}

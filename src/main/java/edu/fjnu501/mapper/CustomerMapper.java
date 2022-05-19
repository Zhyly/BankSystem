package edu.fjnu501.mapper;

import edu.fjnu501.domain.Customer;

public interface CustomerMapper {

    // 通过UID查找账号信息
    Customer getCustomerInfoByUid(int uid);

    // 注册账号
    void registerAccount(Customer customer);

    // 查找登录账号是否存在
    Customer selectUsername(String username);

    // 账号存在时进行密码验证
    Customer login(Customer customer);

    // 查找最大ID号
    int findMaxId();

    void updateInfo(Customer customer);

    Customer getUserByUsername(String username);

    String[] getAllIdentityNumber();

}

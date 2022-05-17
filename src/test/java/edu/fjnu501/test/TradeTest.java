package edu.fjnu501.test;

import edu.fjnu501.bankenum.Trade;
import edu.fjnu501.domain.Customer;
import edu.fjnu501.utils.MD5Password;
import org.junit.Test;

public class TradeTest {

    @Test
    public void trade() {
        System.out.println(Trade.withdraw.getType().equals("0"));
    }

    @Test
    public void test() {
        double money = 100;
        money = - money;
        System.out.println(money + 500);
    }

    @Test
    public void test2() {
        Customer customer = new Customer();
        customer.setUsername("林羽");
        customer.setPassword("123");
        String pwd = MD5Password.MD5Pwd(customer);
        System.out.println(pwd);
    }

}

package edu.fjnu501.test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUsernameTest {

    @Test
    public void test() {
        double money1 = 500;
        double money = -100;
        System.out.println(money1 + money);
    }

    @Test
    public void getRandomUserName() throws ParseException {
        int maxId = 5;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String srcDate = "2002-03-28";
        Date late = simpleDateFormat.parse(srcDate);
        Date now = new Date();
        long timestamp = ((now.getTime() - late.getTime()) / 100);
        System.out.println(timestamp + maxId);
//        int timestamp = (int) (System.currentTimeMillis() / 1000 % 1000000000);

//        int len = 5;
//        int num = 0;
//        for (int i = 0; i < len; i++) {
//            if (i == len) {
//                num += Math.random() * 9 + 1;
//            }
//            num += (int) (Math.random() * 10  * Math.pow(10, i));
//        }
//        System.out.println(num);
    }

}

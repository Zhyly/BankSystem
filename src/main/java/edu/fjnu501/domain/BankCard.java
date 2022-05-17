package edu.fjnu501.domain;

public class BankCard {

    private int cid;
    private int uid;
    private double balance;

    @Override
    public String toString() {
        return "BankCard{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", balance=" + balance +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

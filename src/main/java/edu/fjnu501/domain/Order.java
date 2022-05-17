package edu.fjnu501.domain;

public class Order {

    private int oid;
    private int cid;
    private int uid;
    private String type;
    private double amount;

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", cid=" + cid +
                ", uid=" + uid +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

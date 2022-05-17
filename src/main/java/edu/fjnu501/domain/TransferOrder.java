package edu.fjnu501.domain;

public class TransferOrder {

    private int srcCid;
    private int distCid;
    private int uid;  // 发起转账的用户uid
    private double amount;

    @Override
    public String toString() {
        return "TransferOrder{" +
                "srcCid=" + srcCid +
                ", distCid=" + distCid +
                ", uid=" + uid +
                ", amount=" + amount +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSrcCid() {
        return srcCid;
    }

    public void setSrcCid(int srcCid) {
        this.srcCid = srcCid;
    }

    public int getDistCid() {
        return distCid;
    }

    public void setDistCid(int distCid) {
        this.distCid = distCid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

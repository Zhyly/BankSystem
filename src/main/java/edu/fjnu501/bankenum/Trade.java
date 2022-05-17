package edu.fjnu501.bankenum;

public enum Trade {
    save("0"), withdraw("1");

    private String type;

    Trade(String s) {
        type = s;
    }

    public String getType() {
        return this.type;
    }

}

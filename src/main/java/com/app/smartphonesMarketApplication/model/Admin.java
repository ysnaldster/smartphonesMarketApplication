package com.app.smartphonesMarketApplication.model;

public class Admin extends User{
    private int mainKey;

    public Admin(String name, String email) {
        super(name, email);
    }

    public int getMainKey() {
        return mainKey;
    }

    public void setMainKey(int mainKey) {
        this.mainKey = mainKey;
    }
}

package com.dto;

public class BankCard {
    String number;
    User user;

    public BankCard(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }
}

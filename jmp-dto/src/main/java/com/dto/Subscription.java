package com.dto;

import java.time.LocalDate;

public class Subscription {
    String cardNumber;
    LocalDate startDate;

    public Subscription(String cardNumber) {

        this.cardNumber = cardNumber;
        this.startDate = LocalDate.now();
    }

    public String getCardNumber() {
        return cardNumber;
    }
}

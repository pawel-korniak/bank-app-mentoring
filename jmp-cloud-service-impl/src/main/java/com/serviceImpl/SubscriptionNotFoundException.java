package com.serviceImpl;

public class SubscriptionNotFoundException extends Exception{
    public SubscriptionNotFoundException(String cardNumber) {
        super(String.format("Subscription with card number: %s, does not exist.",cardNumber));
    }
}

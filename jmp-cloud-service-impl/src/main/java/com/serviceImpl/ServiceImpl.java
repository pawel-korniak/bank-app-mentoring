package com.serviceImpl;

import com.dto.BankCard;
import com.dto.Subscription;
import com.dto.User;
import com.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {

    List<Subscription> subscriptionList = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    @Override
    public void subscribe(BankCard bankCard) {
        subscriptionList.add(new Subscription(bankCard.getNumber()));
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return subscriptionList.stream()
                .filter(subscription -> subscription.getCardNumber().equals(cardNumber))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition) {
        return subscriptionList.stream()
                .filter(condition)
                .collect(Collectors.toUnmodifiableList());
    }
}

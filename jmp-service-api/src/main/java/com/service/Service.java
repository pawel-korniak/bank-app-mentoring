package com.service;

import com.dto.BankCard;
import com.dto.Subscription;
import com.dto.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Service {

    int PAYABLE_USER_AGE = 18;

    static Boolean isPayableUser(User user){
        return ChronoUnit.YEARS.between(user.getBirthday(),LocalDate.now()) >= PAYABLE_USER_AGE;
    }

    void subscribe(BankCard bankCard);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);
    List<User> getAllUsers();
    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition);

    default Double getAverageUsersAge(){
        return getAllUsers().stream()
                .map(user -> user.getBirthday())
                .mapToLong(birthday -> ChronoUnit.YEARS.between(birthday,LocalDate.now()))
                .average()
                .getAsDouble();
    }


}

package com.cloudBank;

import com.bank.Bank;
import com.dto.*;

import java.util.Map;
import java.util.function.BiFunction;

public class BankImpl implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        return mapBankCard.apply(bankCardType,user);
    }

    BiFunction<BankCardType,User,BankCard> mapBankCard = ((bankCardType, user) -> {
        Map<BankCardType,BankCard> map = Map.of(
                BankCardType.DEBIT,new DebitBankCard(user),
                BankCardType.CREDIT,new CreditBankCard(user)
        );
        return map.get(bankCardType);
    });
}

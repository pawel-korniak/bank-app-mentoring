package com.bank;

import com.dto.BankCard;
import com.dto.BankCardType;
import com.dto.User;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
}

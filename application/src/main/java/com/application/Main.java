package com.application;

import com.bank.Bank;
import com.service.Service;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Service> serviceServiceLoader = ServiceLoader.load(Service.class);
        for (Service service : serviceServiceLoader) {
            System.out.println(service);
        }
        ServiceLoader<Bank> bankServiceLoader = ServiceLoader.load(Bank.class);
        for (Bank bank : bankServiceLoader) {
            System.out.println(bank);
        }
    }
}

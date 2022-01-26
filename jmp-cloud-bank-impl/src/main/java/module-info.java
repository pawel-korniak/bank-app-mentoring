import com.bank.Bank;

module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;
    requires jmp.dto;
    exports com.cloudBank;
    provides Bank with com.cloudBank.BankImpl;
}
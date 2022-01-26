import com.bank.Bank;
import com.service.Service;

module application {
    requires jmp.dto;
    requires jmp.cloud.service.impl;
    requires jmp.cloud.bank.impl;
    uses Service;
    uses Bank;
}
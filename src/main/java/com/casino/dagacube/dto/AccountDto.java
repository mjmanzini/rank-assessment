package com.casino.dagacube.dto;

import com.casino.dagacube.domain.Account;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AccountDto {
    private Long id;
    private PlayerDto playerDto;
    private double balance;
    private String transactionId;

    public static AccountDto toDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setPlayerDto(PlayerDto.toDto(account.getPlayer()));
        accountDto.setBalance(account.getBalance());
        accountDto.setTransactionId(account.getTransactionId());
        return accountDto;
    }

    static Account fromDto(AccountDto accountDto) {
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setPlayer(PlayerDto.fromDto(accountDto.getPlayerDto()));
        account.setBalance(accountDto.getBalance());
        account.setTransactionId(accountDto.getTransactionId());
        return account;
    }
}

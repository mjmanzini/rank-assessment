package com.casino.dagacube.service;

import com.casino.dagacube.domain.Account;
import com.casino.dagacube.dto.AccountDto;
import com.casino.dagacube.dto.PlayerDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto updateAccount(AccountDto accountDto);
    PlayerDto createPlayer(PlayerDto playerDto);
    Account getAccount(Long playerId, String transactionId);
    AccountDto deductBalance(double amount, Long playerId, String transactionId);
    AccountDto depositBalance(double amount, Long playerId, String transactionId);
}

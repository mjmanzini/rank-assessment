package com.casino.dagacube.service;

import com.casino.dagacube.domain.Account;
import com.casino.dagacube.dto.AccountDto;

import java.util.UUID;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto updateAccount(AccountDto accountDto);
    AccountDto getAccount(Long playerId, UUID transactionId);
}

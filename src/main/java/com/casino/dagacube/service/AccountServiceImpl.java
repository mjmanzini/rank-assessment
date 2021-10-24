package com.casino.dagacube.service;

import com.casino.dagacube.domain.Account;
import com.casino.dagacube.dto.AccountDto;
import com.casino.dagacube.repository.AccountRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import java.util.UUID;
import java.util.logging.Logger;

import static com.casino.dagacube.dto.AccountDto.toDto;

public class AccountServiceImpl implements AccountService {
    private static Logger logger = (Logger) LoggerFactory.getLogger(AccountServiceImpl.class);
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {


        return null;
    }

    @Override
    public AccountDto updateAccount(AccountDto accountDto) {

        return null;
    }

    @Override
    public AccountDto getAccount(Long playerId, UUID transactionId) {
        Account account = new Account();
        try {
            account = accountRepository.findByPlayerAndTransactionId(playerId, transactionId);
        } catch(Exception ex) {
            logger.info(ex.getMessage());
        }
        return toDto(account);
    }
}

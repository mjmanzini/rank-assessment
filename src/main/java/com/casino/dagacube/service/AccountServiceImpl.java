package com.casino.dagacube.service;

import com.casino.dagacube.domain.Account;
import com.casino.dagacube.domain.Player;
import com.casino.dagacube.dto.AccountDto;
import com.casino.dagacube.dto.PlayerDto;
import com.casino.dagacube.repository.AccountRepository;
import com.casino.dagacube.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

import static com.casino.dagacube.dto.AccountDto.toDto;
import static com.casino.dagacube.dto.PlayerDto.fromDto;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public AccountDto updateAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        String transactionId = UUID.randomUUID().toString();
        Player player = fromDto(playerDto);
        player.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        player.setModifiedDate(Timestamp.valueOf(LocalDateTime.now()));
        player.setTransactionId(transactionId);
        player = playerRepository.save(player);
        return PlayerDto.toDto(player);
    }

    @Override
    public Account getAccount(Long playerId, String transactionId) {
        Account account = new Account();
        try {
            account = accountRepository.findByTransactionIdAndPlayer_Id(playerId, transactionId);
        } catch(NullPointerException ex) {
            return new Account();
        }
        return account;
    }

    @Override
    public AccountDto deductBalance(double amount, Long playerId, String transactionId) {
        Account account = getAccount(playerId, transactionId);
        if (account != null) {
            account.setBalance(account.getBalance() - amount);
            account.setModifiedDate(Timestamp.from(Instant.from(LocalDateTime.now())));
            account = accountRepository.save(account);
        }
        return toDto(account);
    }

    @Override
    public AccountDto depositBalance(double amount, Long playerId, String transactionId) {
        Account account = getAccount(playerId, transactionId);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            account.setModifiedDate(Timestamp.from(Instant.from(LocalDateTime.now())));
            account = accountRepository.save(account);
        }
        return toDto(account);
    }
}

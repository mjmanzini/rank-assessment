package com.casino.dagacube.repository;

import com.casino.dagacube.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {
    Account findByTransactionIdAndPlayer_Id(Long playerId, String transactionId);
}

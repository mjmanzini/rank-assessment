package com.casino.dagacube.controller;

import com.casino.dagacube.domain.Account;
import com.casino.dagacube.dto.AccountDto;
import com.casino.dagacube.dto.PlayerDto;
import com.casino.dagacube.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.casino.dagacube.dto.AccountDto.toDto;

@RestController
@RequestMapping(value="api/v1")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     *
     * @param playerId
     * @param transactionId
     * @return
     */
    @GetMapping( value="/player/account/balance")
    ResponseEntity<?> getPlayerBalance(@RequestParam Long playerId, @RequestParam String transactionId) {
        Account account = accountService.getAccount(playerId, transactionId);

        if (account.getPlayer() == null) {
            return ResponseEntity
                    .badRequest()
                    .body("Error: Player does not exist.");
        } else if (account.getBalance() < 1){
            return ResponseEntity
                    .status(418)
                    .body("it is a teapot.");
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(toDto(account));
        }
    }

    /**
     * @param playerId
     * @param transactionId
     * @param amount
     * @return
     */

    @PostMapping( value="/player/account/deduct")
    AccountDto deductBalance(@RequestParam Long playerId, @RequestParam String transactionId, @RequestBody double amount){
        return accountService.deductBalance(amount, playerId, transactionId);
    }

    /**
     *
     * @param playerId
     * @param transactionId
     * @param amount
     * @return
     */
    @PostMapping( value="/player/account/deposit")
    AccountDto depositBalance(@RequestParam Long playerId, @RequestParam String transactionId, @RequestBody double amount) {
        return accountService.depositBalance(amount, playerId, transactionId);
    }

    /**
     *
     * @param playerDto
     * @return
     */
    @PostMapping( value="/player/create")
    PlayerDto createPlayer(@RequestBody PlayerDto playerDto) {
        return accountService.createPlayer(playerDto);
    }
}

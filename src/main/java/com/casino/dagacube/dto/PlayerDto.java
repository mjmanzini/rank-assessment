package com.casino.dagacube.dto;
import com.casino.dagacube.domain.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class PlayerDto {
    private Long id;
    private UUID transactionId;
    private String firstName;
    private String lastName;
    private String emailAddress;

    static PlayerDto toDto(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId(player.getId());
        playerDto.setFirstName(player.getFirstName());
        playerDto.setLastName(player.getLastName());
        playerDto.setEmailAddress(player.getEmailAddress());
        playerDto.setTransactionId(player.getTransactionId());
        return playerDto;
    }

    static Player fromDto(PlayerDto playerDto) {
        Player player = new Player();
        player.setId(playerDto.getId());
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getLastName());
        player.setEmailAddress(playerDto.getEmailAddress());
        player.setTransactionId(playerDto.getTransactionId());
        return player;
    }
}

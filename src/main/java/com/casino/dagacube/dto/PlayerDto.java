package com.casino.dagacube.dto;
import com.casino.dagacube.domain.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;

   public static PlayerDto toDto(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId(player.getId());
        playerDto.setFirstName(player.getFirstName());
        playerDto.setLastName(player.getLastName());
        playerDto.setEmailAddress(player.getEmailAddress());
        return playerDto;
    }

    public static Player fromDto(PlayerDto playerDto) {
        Player player = new Player();
        player.setId(playerDto.getId());
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getLastName());
        player.setEmailAddress(playerDto.getEmailAddress());
        return player;
    }
}

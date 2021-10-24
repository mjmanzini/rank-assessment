package com.casino.dagacube.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity(name="ACCOUNT")
@Getter
@Setter
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerId")
    private Player player;
    @Column
    private double balance;
    @Column
    private UUID transactionId;
}

package com.casino.dagacube.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name="ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerId")
    private Player player;
    @Column
    private double balance;
    @Column
    private String transactionId;
    @Column
    private Timestamp createdDate;
    @Column
    private Timestamp modifiedDate;
}

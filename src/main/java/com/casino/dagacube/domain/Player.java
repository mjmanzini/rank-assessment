package com.casino.dagacube.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "PLAYER")
@Getter
@Setter
public class Player {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private UUID transactionId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String emailAddress;
}

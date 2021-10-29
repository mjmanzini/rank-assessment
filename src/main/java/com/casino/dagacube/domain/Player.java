package com.casino.dagacube.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "PLAYER")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String transactionId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String emailAddress;
    @Column
    private Timestamp createdDate;
    @Column
    private Timestamp modifiedDate;
}

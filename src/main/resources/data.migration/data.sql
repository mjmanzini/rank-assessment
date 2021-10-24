DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS account;

CREATE TABLE player
(
    id             BIGINT NOT NULL,
    transaction_id UUID,
    first_name     VARCHAR(255),
    last_name      VARCHAR(255),
    email_address  VARCHAR(255),
    CONSTRAINT pk_player PRIMARY KEY (id)
);

CREATE TABLE account
(
    id             BIGINT NOT NULL,
    player_id      BIGINT,
    balance        DOUBLE,
    transaction_id UUID,
    CONSTRAINT pk_account PRIMARY KEY (id)
);

ALTER TABLE account
    ADD CONSTRAINT FK_ACCOUNT_ON_PLAYERID FOREIGN KEY (player_id) REFERENCES player (id);

CREATE SEQUENCE player_id_seq AS BIGINT START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE account_id_seq AS BIGINT START WITH 1 INCREMENT BY 1;

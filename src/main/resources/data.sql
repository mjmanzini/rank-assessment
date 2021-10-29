DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS account;

CREATE TABLE player
(
    id             BIGINT NOT NULL,
    created_date TIMESTAMP,
    email_address  VARCHAR(255),
    first_name     VARCHAR(255),
    last_name      VARCHAR(255),
    modified_date TIMESTAMP,
    transaction_id VARCHAR(255),
    CONSTRAINT pk_player PRIMARY KEY (id)
);

CREATE TABLE account
(
    id             BIGINT NOT NULL,
    player_id      BIGINT,
    balance        DOUBLE,
    transaction_id VARCHAR(255),
    created_date Timestamp,
    modified_date Timestamp,
    CONSTRAINT pk_account PRIMARY KEY (id)
);

ALTER TABLE account
    ADD CONSTRAINT FK_ACCOUNT_ON_PLAYERID FOREIGN KEY (player_id) REFERENCES player (id);

//## ACCOUNT TABLE
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(1,	1,	1000,	'99b60519-2842-4ae7-bdbe-2c5e25ea06d8',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(2,	2,	2000,	'2d28a614-e93d-4274-9e28-d7af3cb140343',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(3,	3,	3000,	'70a5ee8e-ca04-4d1c-86af-88c77297fb7a',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(4,	4,	4000,	'cd41a941-4cdc-45ba-913a-567baed451ce',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(5,	5,	5000,	'1aa76f02-44f9-4e00-a696-7194fd0f26e4',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(6,	6,	6000,	'247e8dc2-4dde-43ad-a606-7ae45fe2515w',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(7,	7,	7000,	'32409fde-1616-4d1e-aa41-fe5f50e68878',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(8,	8,	8000,	'20f5383f-5687-41df-b833-307dbdf6bc83',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(9,	9,	0.0,	'99b60519-2842-4ae7-bdbe-2c5e25ea0632',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);
insert into account(ID,player_id,balance,transaction_id,created_date,modified_date)
values(10,	10,	1,	'99b60519-2842-4ae7-bdbe-2c5e25ea06d8',	'2021-10-29 04:20:30.851916','2021-10-29 04:20:30.851916'	);

//## PLAYER TABLE
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(1,	'2021-10-29 04:20:30.851916',	'wesley@gmail.com',	'Wesley',	'Doe',	'2021-10-29 04:20:30.851916',	'99b60519-2842-4ae7-bdbe-2c5e25ea06d9');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(2,	'2021-10-29 04:20:30.851916',	'jessy@gmail.com',	'Jessy',	'Doe',	'2021-10-29 04:20:30.851916',	'6ee792db-3450-4efb-b70a-b5930bdf6905');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(3,	'2021-10-29 04:20:30.851916',	'alex@gmail.com',	'Alex',	'Doe',	'2021-10-29 04:20:30.851916',	'2d28a614-e93d-4274-9e28-d7af3cb140345');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(4,	'2021-10-29 04:20:30.851916',	'roy@gmail.com',	'Roy',	'Doe',	'2021-10-29 04:20:30.851916',	'70a5ee8e-ca04-4d1c-86af-88c77297fb7d');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(5,	'2021-10-29 04:20:30.851916',	'chris@gmail.com',	'Chris',	'Doe',	'2021-10-29 04:20:30.851916',	'cd41a941-4cdc-45ba-913a-567baed451cc');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(6,	'2021-10-29 04:20:30.851916',	'ronny@gmail.com',	'Ronny',	'Doe',	'2021-10-29 04:20:30.851916',	'1aa76f02-44f9-4e00-a696-7194fd0f26e9');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(7,	'2021-10-29 04:20:30.851916',	'eric@gmail.com',	'Eric',	'Doe',	'2021-10-29 04:20:30.851916',	'247e8dc2-4dde-43ad-a606-7ae45fe2515e');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(8,	'2021-10-29 04:20:30.851916',	'senior@gmail.com',	'Senior',	'Doe',	'2021-10-29 04:20:30.851916',	'32409fde-1616-4d1e-aa41-fe5f50e68879');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(9,	'2021-10-29 04:20:30.851916',	'embrahim@gmail.com',	'Embrahim',	'Doe',	'2021-10-29 04:20:30.851916',	'20f5383f-5687-41df-b833-307dbdf6bc82');
insert into player(ID,CREATED_DATE,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,MODIFIED_DATE,TRANSACTION_ID)
values(10,	'2021-10-29 04:20:30.851916',	'ariel@gmail.com',	'Ariel',	'Doe',	'2021-10-29 04:20:30.851916',	'bd9e38e9-ae5d-46d8-bcc1-accd807c441a');

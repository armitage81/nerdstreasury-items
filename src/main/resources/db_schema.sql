CREATE TABLE ITEM (
    ID BIGINT PRIMARY KEY,
    TITLE VARCHAR,
    SORT_TERM VARCHAR,
    DEVELOPER VARCHAR,
    PUBLISHER VARCHAR,
    GENRE VARCHAR
); 

create table USER (
	ID BIGINT PRIMARY KEY,
	USERNAME VARCHAR, 
	PASSWORD VARCHAR,
	FIRST_NAME VARCHAR,
	SECOND_NAME VARCHAR,
	ENABLED BOOLEAN
);

create table USER_AUTHORITY (
	ID BIGINT PRIMARY KEY,
	USERNAME VARCHAR, 
	AUTHORITY VARCHAR
);


 CREATE SEQUENCE ITEM_SEQUENCE_ID START WITH 1000;
 CREATE SEQUENCE USER_SEQUENCE_ID START WITH 1000;
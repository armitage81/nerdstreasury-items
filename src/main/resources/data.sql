INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (1, 'Mario', 'Mario', 'Nintendo', 'Nintendo', 'Platformer');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (2, 'Sonic', 'Sonic', 'Sega', 'Sega', 'Platformer');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (3, 'Zelda', 'Zelda', 'Nintendo', 'Nintendo', 'Action Adventure');

INSERT INTO USER (ID, USERNAME, PASSWORD, FIRST_NAME, SECOND_NAME, ENABLED) VALUES (1, 'armitage81', '$2a$10$p0flpiolweoY0muI47aCD.zdfK05tYM4oYrX3NtRShdXXyfOh2tim', 'Anton', 'Afanasjew', true);

INSERT INTO USER_AUTHORITY (ID, USERNAME, AUTHORITY) VALUES (1, 'armitage81', 'ROLE_USER');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE, SYSTEM) VALUES (1, 'Mario', 'Mario', 'Nintendo', 'Nintendo', 'Platformer', 'NES');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE, SYSTEM) VALUES (2, 'Sonic', 'Sonic', 'Sega', 'Sega', 'Platformer', 'Sega Mega Drive');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE, SYSTEM) VALUES (3, 'Zelda', 'Zelda', 'Nintendo', 'Nintendo', 'Action Adventure', 'SNES');

INSERT INTO USER (ID, USERNAME, PASSWORD, ENABLED) VALUES (1, 'armitage81', '$2a$10$p0flpiolweoY0muI47aCD.zdfK05tYM4oYrX3NtRShdXXyfOh2tim', true);

INSERT INTO USER_AUTHORITY (ID, USERNAME, AUTHORITY) VALUES (1, 'armitage81', 'user');
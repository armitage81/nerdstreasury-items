INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (1, 'Mario', 'Mario', 'Nintendo', 'Nintendo', 'Platformer');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (2, 'Sonic', 'Sonic', 'Sega', 'Sega', 'Platformer');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (3, 'Zelda', 'Zelda', 'Nintendo', 'Nintendo', 'Action Adventure');

INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (4, 'God of War', 'God of War', 'Sony Santa Monica', 'Sony', 'Action Adventure');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (5, 'Uncharted', 'Uncharted', 'Naughty Dog', 'Sony', 'Action Adventure');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (6, 'Halo', 'Halo', 'Bungee', 'Microsoft', 'Shooter');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (7, 'Half-Life', 'Half-Life', 'Valve', 'Valve', 'Shooter');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (8, 'Fallout 4', 'Fallout 4', 'Bethesda', 'Bethesda', 'RPG');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (9, 'Unreal', 'Unreal', 'Epic Games', 'Epic Games', 'Shooter');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (10, 'Colin McRae Rally', 'Colin McRae Rally', 'Codemasters', 'Codemasters', 'Racing');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (11, 'Wave Race', 'Wave Race', 'Nintendo', 'Nintendo', 'Racing');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (12, 'Mortal Combat', 'Mortal Combat', 'Midway', 'Midway', 'Fighting');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (13, 'Planescape Torment', 'Planescape Torment', 'Bioware', 'Bioware', 'RPG');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (14, 'Monkey Island', 'Monkey Island', 'Lucas Arts', 'Lucas Arts', 'Adventure');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (15, 'Resident Evil', 'Resident Evil', 'Capcom', 'Capcom', 'Action Adventure');
INSERT INTO ITEM (ID, TITLE, SORT_TERM, DEVELOPER, PUBLISHER, GENRE) VALUES (16, 'The Day of the Tentacle', 'Day of the Tentacle, The', 'Lucas Arts', 'Lucas Arts', 'Adventure');


INSERT INTO USER (ID, USERNAME, PASSWORD, FIRST_NAME, SECOND_NAME, ENABLED) VALUES (1, 'armitage81', '$2a$10$p0flpiolweoY0muI47aCD.zdfK05tYM4oYrX3NtRShdXXyfOh2tim', 'Anton', 'Afanasjew', true);

INSERT INTO USER_AUTHORITY (ID, USERNAME, AUTHORITY) VALUES (1, 'armitage81', 'ROLE_USER');
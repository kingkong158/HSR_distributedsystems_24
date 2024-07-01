CREATE SEQUENCE fusballspieler_karte_seq START 1;

CREATE TABLE fusballspieler_karte (
    karten_nr SERIAL PRIMARY KEY,
    spielername VARCHAR(50) NOT NULL,
    manschaft VARCHAR(50) NOT NULL,
    position VARCHAR(255) NOT NULL,
    marktwert INT
);

INSERT INTO fusballspieler_karte(spielername, manschaft, position, marktwert)
VALUES ('Thomas Mueller', 'Deutschland', 'Mittelfeld', '100000000'); 

INSERT INTO fusballspieler_karte(spielername, manschaft, position, marktwert)
VALUES ('Phillip Lahm', 'Deutschland', 'Verteidigung', '999999999'); 

INSERT INTO fusballspieler_karte(spielername, manschaft, position, marktwert)
VALUES ('Manuel Neuer', 'Deutschland', 'Torwart', '120000000');

INSERT INTO fusballspieler_karte(spielername, manschaft, position, marktwert)
VALUES ('Lionel Messi', 'Argentinien', 'Sturm', '200000000');

INSERT INTO fusballspieler_karte(spielername, manschaft, position, marktwert)
VALUES ('Christiano Ronaldo', 'Portugal', 'Sturm', '200000000');

--SELECT * FROM fusballspieler_karte;

--DELETE FROM fusballspieler_karte WHERE spielername = 'Lionel Messi';
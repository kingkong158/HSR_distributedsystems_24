CREATE SEQUENCE fusballspielerKarte_seq START 1;

CREATE TABLE fusballspielerKarte (
    karten_nr SERIAL PRIMARY KEY,
    spielername VARCHAR(50) NOT NULL,
    manschaft VARCHAR(50) NOT NULL,
    position VARCHAR(255) NOT NULL,
    marktwert INT
);

INSERT INTO fusballspielerKarte(spielername, manschaft, position, marktwert)
VALUES ('Thomas Mueller', 'Deutschland', 'Mittelfeld', '100000000'); 

INSERT INTO fusballspielerKarte(spielername, manschaft, position, marktwert)
VALUES ('Phillip Lahm', 'Deutschland', 'Verteidigung', '999999999'); 

INSERT INTO fusballspielerKarte(spielername, manschaft, position, marktwert)
VALUES ('Manuel Neuer', 'Deutschland', 'Torwart', '120000000');

INSERT INTO fusballspielerKarte(spielername, manschaft, position, marktwert)
VALUES ('Lionel Messi', 'Argentinien', 'Sturm', '200000000');

INSERT INTO fusballspielerKarte(spielername, manschaft, position, marktwert)
VALUES ('Christiano Ronaldo', 'Portugal', 'Sturm', '200000000');

--SELECT * FROM fusballspielerKarte;

--DELETE FROM fusballspielerKarte WHERE spielername = 'Lionel Messi';
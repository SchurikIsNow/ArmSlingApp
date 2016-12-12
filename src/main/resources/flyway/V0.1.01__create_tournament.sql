CREATE TABLE arm_tournament (
    id BIGINT NOT NULL PRIMARY KEY,
    tournamenttype VARCHAR NOT NULL
);

CREATE TABLE pers_personaldata (
    id BIGINT NOT NULL PRIMARY KEY,
    firstName VARCHAR NOT NULL,
    lastName VARCHAR NOT NULL,
    middleName VARCHAR
);

CREATE TABLE pers_wrestler (
    id BIGINT NOT NULL PRIMARY KEY,
    mass NUMERIC(3, 3),
    team VARCHAR,
    city VARCHAR,
    personalData_id BIGINT NOT NULL REFERENCES pers_personaldata (id)
);

CREATE SEQUENCE arm_tournament_seq;
CREATE SEQUENCE pers_personaldata_seq;
CREATE SEQUENCE pers_wrestler_seq;

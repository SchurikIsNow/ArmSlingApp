CREATE TABLE arm_tournament (
    id BIGINT NOT NULL PRIMARY KEY,
    tournamentType VARCHAR NOT NULL,
    sexCategory VARCHAR NOT NULL,
    massCategory VARCHAR NOT NULL,
    ageCategory VARCHAR NOT NULL,
    place VARCHAR,
    beginDate DATE
);

CREATE TABLE pers_personaldata (
    id BIGINT NOT NULL PRIMARY KEY,
    firstName VARCHAR NOT NULL,
    lastName VARCHAR NOT NULL,
    middleName VARCHAR,
    birthDate DATE
);

CREATE TABLE pers_wrestler (
    id BIGINT NOT NULL PRIMARY KEY,
    mass INTEGER,
    team_id BIGINT,
    city_id BIGINT NOT NULL,
    personalData_id BIGINT NOT NULL REFERENCES pers_personaldata (id),
    tournament_id BIGINT NOT NULL REFERENCES arm_tournament (id)
);

CREATE TABLE pers_judge (
    id BIGINT NOT NULL PRIMARY KEY,
    category VARCHAR,
    personalData_id BIGINT NOT NULL REFERENCES pers_personaldata (id),
    tournament_id BIGINT NOT NULL REFERENCES arm_tournament (id)
);

CREATE TABLE pers_team (
    id BIGINT NOT NULL PRIMARY KEY,
    teamName VARCHAR NOT NULL
);

CREATE TABLE pers_city (
    id BIGINT NOT NULL PRIMARY KEY,
    cityName VARCHAR NOT NULL
);

CREATE SEQUENCE arm_tournament_seq;
CREATE SEQUENCE pers_personaldata_seq;
CREATE SEQUENCE pers_wrestler_seq;
CREATE SEQUENCE pers_judge_seq;
CREATE SEQUENCE pers_team_seq;
CREATE SEQUENCE pers_city_seq;

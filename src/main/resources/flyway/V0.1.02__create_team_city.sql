

CREATE TABLE pers_team (
    id BIGINT NOT NULL PRIMARY KEY,
    teamName VARCHAR NOT NULL
);

CREATE TABLE pers_city (
    id BIGINT NOT NULL PRIMARY KEY,
    cityName VARCHAR NOT NULL
);

CREATE SEQUENCE pers_team_seq;
CREATE SEQUENCE pers_city_seq;

ALTER TABLE pers_wrestler DROP COLUMN team;
ALTER TABLE pers_wrestler DROP COLUMN city;

ALTER TABLE pers_wrestler ADD COLUMN team_id BIGINT;
ALTER TABLE pers_wrestler ADD COLUMN city_id BIGINT NOT NULL;
ALTER TABLE pers_wrestler ADD COLUMN tournament_id BIGINT NOT NULL;
ALTER TABLE pers_personaldata ADD COLUMN birthDate DATE;


--CREATE TABLE pers_wrestler (
--    id BIGINT NOT NULL PRIMARY KEY,
--    mass NUMERIC(3, 3),
--    team VARCHAR,
--    city VARCHAR,
--    personalData_id BIGINT NOT NULL REFERENCES pers_personaldata (id)
--);
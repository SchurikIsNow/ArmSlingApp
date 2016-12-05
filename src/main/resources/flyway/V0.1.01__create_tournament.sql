CREATE TABLE arm_tournament (
    id BIGINT NOT NULL,
    tournamenttype VARCHAR,

    CONSTRAINT arm_tournament_pkey PRIMARY KEY (id)
);

CREATE TABLE pers_personaldata (
    id BIGINT NOT NULL,
    firstName VARCHAR,
    lastName VARCHAR,
    middleName VARCHAR,

    CONSTRAINT pers_personaldata_pkey PRIMARY KEY (id)
);

CREATE TABLE pers_wrestler (
    id BIGINT NOT NULL,
    mass NUMERIC(3, 3),
    team VARCHAR,
    city VARCHAR,

    CONSTRAINT pers_wrestler_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE arm_tournament_seq;
CREATE SEQUENCE pers_personaldata_seq;
CREATE SEQUENCE pers_wrestler_seq;

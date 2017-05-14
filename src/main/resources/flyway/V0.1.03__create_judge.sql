
CREATE TABLE pers_judge (
    id BIGINT NOT NULL PRIMARY KEY,
    category VARCHAR,
    personalData_id BIGINT NOT NULL REFERENCES pers_personaldata (id)
);

CREATE SEQUENCE pers_judge_seq;


ALTER TABLE pers_judge ADD COLUMN tournament_id BIGINT NOT NULL REFERENCES arm_tournament (id);
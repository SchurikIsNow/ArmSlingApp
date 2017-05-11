package bogdanov.entity.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_team")
@SequenceGenerator(name = "pers_team_seq", sequenceName = "pers_team_seq", allocationSize = 1)
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_team_seq")
    private Long id;
    private String teamName;

}
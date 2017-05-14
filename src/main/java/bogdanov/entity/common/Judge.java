package bogdanov.entity.common;

import bogdanov.entity.tournament.AbstractTournament;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_judge")
@SequenceGenerator(name = "pers_judge_seq", sequenceName = "pers_judge_seq", allocationSize = 1)
public class Judge {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_judge_seq")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "personalData_id")
    private PersonalData personalData;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tournament_id")
    private AbstractTournament tournament;

    private String category;
}

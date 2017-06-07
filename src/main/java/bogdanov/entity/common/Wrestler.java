package bogdanov.entity.common;

import bogdanov.entity.enums.LevelEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_wrestler")
@SequenceGenerator(name = "pers_wrestler_seq", sequenceName = "pers_wrestler_seq", allocationSize = 1)
public class Wrestler {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_wrestler_seq")
    private Long id;

    private Integer mass;
    private Integer rating;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "personalData_id")
    private PersonalData personalData;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    @Enumerated(EnumType.STRING)
    @Column(name = "lvl", updatable = false)
    private LevelEnum level;
}

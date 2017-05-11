package bogdanov.entity.tournament;

import bogdanov.entity.common.Wrestler;
import bogdanov.entity.enums.TournamentTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "arm_tournament")
@SequenceGenerator(name = "arm_tournament_seq", sequenceName = "arm_tournament_seq", allocationSize = 1)
@DiscriminatorColumn(name = "tournamentType")
public abstract class AbstractTournament {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "arm_tournament_seq")
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name="tournamentType", insertable = false, updatable = false)
  private TournamentTypeEnum tournamentType;

  @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "tournament")
  private List<Wrestler> wrestlers;

}

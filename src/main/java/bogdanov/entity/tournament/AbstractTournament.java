package bogdanov.entity.tournament;

import bogdanov.entity.enums.TournamentTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "arm_tournament")
@SequenceGenerator(name="AbstractTournament_seq")
public class AbstractTournament {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AbstractTournament_seq")
  private Long id;

  private String name;

  @Enumerated(EnumType.STRING)
  private TournamentTypeEnum tournamentType;

}

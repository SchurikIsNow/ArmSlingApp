package bogdanov.entity.tournament;

import bogdanov.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "arm_tournament")
public abstract class AbstractTournament extends AbstractEntity {

  private String name;

}

package bogdanov.entity.tournament;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ARM_FIGHT")
public class ArmFightTournament extends AbstractTournament {

}

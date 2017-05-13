package bogdanov.entity.tournament;

import bogdanov.entity.enums.TournamentTypeEnum;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ARM_FIGHT")
public class ArmFightTournament extends AbstractTournament {

    public ArmFightTournament() {
        setTournamentType(TournamentTypeEnum.ARM_FIGHT);
    }
}

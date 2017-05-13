package bogdanov.entity.tournament;

import bogdanov.entity.enums.TournamentTypeEnum;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TWO_HANDED")
public class TwoHandedTournament extends AbstractTournament {

    public TwoHandedTournament() {
        setTournamentType(TournamentTypeEnum.TWO_HANDED);
    }
}

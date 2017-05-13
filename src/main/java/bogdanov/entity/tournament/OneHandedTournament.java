package bogdanov.entity.tournament;

import bogdanov.entity.enums.TournamentTypeEnum;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ONE_HANDED")
public class OneHandedTournament extends AbstractTournament {

    public OneHandedTournament() {
        setTournamentType(TournamentTypeEnum.ONE_HANDED);
    }

}

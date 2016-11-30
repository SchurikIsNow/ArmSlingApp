package bogdanov.entity.tournament;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TWO_HANDED")
public class QweTournament extends AbstractTournament {

}

package bogdanov.entity.tournament;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ONE_HANDED")
public class OneHandedTournament extends AbstractTournament {

}

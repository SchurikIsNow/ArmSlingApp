package bogdanov.service;


import bogdanov.entity.enums.TournamentTypeEnum;
import bogdanov.entity.tournament.AbstractTournament;
import bogdanov.entity.tournament.TwoHandedTournament;
import bogdanov.entity.tournament.OneHandedTournament;
import bogdanov.repository.AbstractTournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArmServiceImpl implements ArmService {

  @Autowired
  private AbstractTournamentRepository tournamentRepository;

  public String sayHello() {
    AbstractTournament tournament = new OneHandedTournament();
    tournament.setTournamentType(TournamentTypeEnum.ONE_HANDED);

    tournamentRepository.save(tournament);

    tournament = new TwoHandedTournament();
    tournament.setTournamentType(TournamentTypeEnum.TWO_HANDED);


    tournamentRepository.save(tournament);
    System.out.println("Hello");
    return "Hello";
  }

  public List<AbstractTournament> findAllTournaments() {
    return (List<AbstractTournament>) tournamentRepository.findAll();
  }
}

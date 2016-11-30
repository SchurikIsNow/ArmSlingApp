package bogdanov.service;


import bogdanov.entity.enums.TournamentTypeEnum;
import bogdanov.entity.tournament.AbstractTournament;
import bogdanov.entity.tournament.QweTournament;
import bogdanov.entity.tournament.SimplyTournament;
import bogdanov.repository.AbstractTournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArmServiceImpl implements ArmService {

  @Autowired
  private AbstractTournamentRepository tournamentRepository;

  public String sayHello() {
    AbstractTournament tournament = new SimplyTournament();
    tournament.setName("77777");
    tournament.setTournamentType(TournamentTypeEnum.ONE_HANDED);

    tournamentRepository.save(tournament);

    tournament = new QweTournament();
    tournament.setName("asdasda");
    tournament.setTournamentType(TournamentTypeEnum.TWO_HANDED);


    tournamentRepository.save(tournament);
    System.out.println("Hello");
    return "Hello";
  }

  public List<AbstractTournament> findAllTournaments() {
    return (List<AbstractTournament>) tournamentRepository.findAll();
  }
}

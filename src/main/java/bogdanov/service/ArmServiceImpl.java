package bogdanov.service;


import bogdanov.entity.enums.TournamentTypeEnum;
import bogdanov.entity.tournament.SimplyTournament;
import bogdanov.repository.SimplyTournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ArmServiceImpl implements ArmService {

  @Autowired
  private SimplyTournamentRepository tournamentRepository;

  public String sayHello() {
    SimplyTournament tournament = new SimplyTournament();
    tournament.setName("123123");
    tournament.setTournamentType(TournamentTypeEnum.ONE_HANDED);
//        tournament.setId(1L);
    tournamentRepository.save(tournament);
    System.out.println("Hello");
    return "Hello";
  }

}

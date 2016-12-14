package bogdanov.services.soap;

import bogdanov.entity.tournament.AbstractTournament;
import bogdanov.entity.wrestler.Wrestler;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;



@WebService
public interface ArmService {

  @WebMethod
  String sayHello();

  @WebMethod
  Wrestler createTestWrestler();

  @WebMethod
  List<AbstractTournament> findAllTournaments();

}

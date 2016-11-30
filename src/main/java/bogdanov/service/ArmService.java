package bogdanov.service;

import bogdanov.entity.tournament.AbstractTournament;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;



@WebService
public interface ArmService {

  @WebMethod
  String sayHello();

  @WebMethod
  List<AbstractTournament> findAllTournaments();

}

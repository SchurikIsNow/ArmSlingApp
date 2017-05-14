package bogdanov.services.soap;

import bogdanov.dto.JudgeDTO;
import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Judge;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.tournament.AbstractTournament;

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
    Wrestler createWrestler(WrestlerDTO wrestlerDto);

    @WebMethod
    Judge createJudge(JudgeDTO judgeDTO);

    @WebMethod
    List<JudgeDTO> findAllJudges();

    @WebMethod
    List<AbstractTournament> findAllTournaments();

    @WebMethod
    List<WrestlerDTO> findAllWrestlers();

}

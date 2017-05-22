package bogdanov.services.soap;

import bogdanov.dto.CityDTO;
import bogdanov.dto.JudgeDTO;
import bogdanov.dto.TeamDTO;
import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.tournament.AbstractTournament;
import org.springframework.data.domain.Sort;

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
    WrestlerDTO createWrestler(WrestlerDTO wrestlerDto);

    @WebMethod
    JudgeDTO createJudge(JudgeDTO judgeDTO);

    @WebMethod
    List<JudgeDTO> findAllJudges(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<AbstractTournament> findAllTournaments();

    @WebMethod
    List<WrestlerDTO> findAllWrestlers();

    @WebMethod
    List<CityDTO> findAllCities(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<TeamDTO> findAllTeams(int page, int size, Sort.Direction direction, String[] properties);
}

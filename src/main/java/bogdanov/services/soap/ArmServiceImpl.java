package bogdanov.services.soap;


import bogdanov.dto.CityDTO;
import bogdanov.dto.JudgeDTO;
import bogdanov.dto.TeamDTO;
import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.PersonalData;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.enums.TournamentTypeEnum;
import bogdanov.entity.tournament.AbstractTournament;
import bogdanov.entity.tournament.OneHandedTournament;
import bogdanov.entity.tournament.TwoHandedTournament;
import bogdanov.repository.AbstractTournamentRepository;
import bogdanov.repository.WrestlerRepository;
import bogdanov.services.cg.CityCgService;
import bogdanov.services.cg.JudgeCgService;
import bogdanov.services.cg.TeamCgService;
import bogdanov.services.cg.WrestlerCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.List;

public class ArmServiceImpl implements ArmService {

    @Autowired
    private AbstractTournamentRepository tournamentRepository;

    @Autowired
    private WrestlerRepository wrestlerRepository;

    @Autowired
    private JudgeCgService judgeCgService;

    @Autowired
    private CityCgService cityCgService;

    @Autowired
    private TeamCgService teamCgService;
    @Autowired
    private WrestlerCgService wrestlerCgService;

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

    public Wrestler createTestWrestler() {
        PersonalData personalData = new PersonalData();
        Wrestler wrestler = new Wrestler();
        personalData.setFirstName("Arm");
        personalData.setLastName("Wrestling");
        wrestler.setPersonalData(personalData);
        return wrestlerRepository.save(wrestler);
    }

    public List<AbstractTournament> findAllTournaments() {
        return (List<AbstractTournament>) tournamentRepository.findAll();
    }

    public WrestlerDTO createWrestler(WrestlerDTO wrestlerDto) {
        return wrestlerCgService.createWrestler(wrestlerDto);
    }

    public List<WrestlerDTO> findAllWrestlers() {
        return wrestlerCgService.findAllWrestlers();
    }

    public List<JudgeDTO> findAllJudges(int page, int size, Sort.Direction direction, String[] properties) {
        return judgeCgService.findAllJudges(page, size, direction, properties);
    }

    public JudgeDTO createJudge(JudgeDTO judgeDTO) {
        return judgeCgService.createJudge(judgeDTO);
    }

    public List<CityDTO> findAllCities(int page, int size, Sort.Direction direction, String[] properties) {
        return cityCgService.findAllCities(page, size, direction, properties);
    }

    public List<TeamDTO> findAllTeams(int page, int size, Sort.Direction direction, String[] properties) {
        return teamCgService.findAllTeams(page, size, direction, properties);
    }


}


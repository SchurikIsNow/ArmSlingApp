package bogdanov.services.soap;


import bogdanov.dto.*;
import bogdanov.entity.common.*;
import bogdanov.entity.enums.TournamentTypeEnum;
import bogdanov.entity.tournament.AbstractTournament;
import bogdanov.entity.tournament.ArmFightTournament;
import bogdanov.entity.tournament.OneHandedTournament;
import bogdanov.entity.tournament.TwoHandedTournament;
import bogdanov.repository.AbstractTournamentRepository;
import bogdanov.repository.JudgeRepository;
import bogdanov.repository.PersonalDataRepository;
import bogdanov.repository.WrestlerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ArmServiceImpl implements ArmService {

    @Autowired
    private AbstractTournamentRepository tournamentRepository;

    @Autowired
    private WrestlerRepository wrestlerRepository;

    @Autowired
    private JudgeRepository judgeRepository;

    @Autowired
    private PersonalDataRepository personalDataRepository;

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

    public List<WrestlerDTO> findAllWrestlers() {

        List<WrestlerDTO> ListDTO = new ArrayList<WrestlerDTO>();

        Iterable<Wrestler> wrestlers = wrestlerRepository.findAll();

        for (Wrestler wrestler : wrestlers) {
            ListDTO.add(convertWreslerToDTO(wrestler));
        }
        return ListDTO;
    }

    private WrestlerDTO convertWreslerToDTO(Wrestler wrestler) {
        WrestlerDTO wrestlerDTO = new WrestlerDTO();
        wrestlerDTO.setMass(wrestler.getMass());
        wrestlerDTO.setId(wrestler.getId());

        CityDTO cityDTO = new CityDTO();
        cityDTO.setCityName(wrestler.getCity().getCityName());
        wrestlerDTO.setCity(cityDTO);
        cityDTO.setId(wrestler.getCity().getId());

        TeamDTO teamDTO = new TeamDTO();
        teamDTO.setTeamName(wrestler.getTeam().getTeamName());
        wrestlerDTO.setTeam(teamDTO);
        teamDTO.setId(wrestler.getTeam().getId());

        PersonalDataDTO personalDataDTO = new PersonalDataDTO();
        PersonalData personalData = wrestler.getPersonalData();
        personalDataDTO.setBirthDate(personalData.getBirthDate());
        personalDataDTO.setFirstName(personalData.getFirstName());
        personalDataDTO.setLastName(personalData.getLastName());
        personalDataDTO.setMiddleName(personalData.getMiddleName());
        personalDataDTO.setId(personalData.getId());
        wrestlerDTO.setPersonalData(personalDataDTO);
        return wrestlerDTO;
    }


    public Wrestler createWrestler(WrestlerDTO wrestlerDto) {
        PersonalData personalData = new PersonalData();
        PersonalDataDTO personalDataDTO = wrestlerDto.getPersonalData();

        personalData.setBirthDate(personalDataDTO.getBirthDate());
        personalData.setFirstName(personalDataDTO.getFirstName());
        personalData.setLastName(personalDataDTO.getLastName());
        personalData.setMiddleName(personalDataDTO.getMiddleName());

        City city = new City();
        city.setCityName(wrestlerDto.getCity().getCityName());

        Team team = new Team();
        team.setTeamName(wrestlerDto.getTeam().getTeamName());

        Wrestler wrestler = new Wrestler();
        wrestler.setMass(wrestlerDto.getMass());
        wrestler.setPersonalData(personalData);
        wrestler.setTeam(team);
        wrestler.setCity(city);
        wrestler.setTournament(new ArmFightTournament());

        return wrestlerRepository.save(wrestler);
    }


    public List<JudgeDTO> findAllJudges() {

        List<JudgeDTO> ListDTO = new ArrayList<JudgeDTO>();

        Iterable<Judge> judges = judgeRepository.findAll();

        for (Judge judge : judges) {
            ListDTO.add(convertJudgeToDTO(judge));
        }
        return ListDTO;
    }

    private JudgeDTO convertJudgeToDTO(Judge judge) {
        JudgeDTO judgeDTO = new JudgeDTO();
        judgeDTO.setCategory(judge.getCategory());
        judgeDTO.setId(judge.getId());

        PersonalDataDTO personalDataDTO = new PersonalDataDTO();
        PersonalData personalData = judge.getPersonalData();
        personalDataDTO.setBirthDate(personalData.getBirthDate());
        personalDataDTO.setFirstName(personalData.getFirstName());
        personalDataDTO.setLastName(personalData.getLastName());
        personalDataDTO.setMiddleName(personalData.getMiddleName());
        personalDataDTO.setId(personalData.getId());
        judgeDTO.setPersonalData(personalDataDTO);
        return judgeDTO;
    }

    public Judge createJudge(JudgeDTO judgeDTO) {
        PersonalData personalData = new PersonalData();
        PersonalDataDTO personalDataDTO = judgeDTO.getPersonalData();
        personalData.setBirthDate(personalDataDTO.getBirthDate());
        personalData.setFirstName(personalDataDTO.getFirstName());
        personalData.setLastName(personalDataDTO.getLastName());
        personalData.setMiddleName(personalDataDTO.getMiddleName());

        Judge judge = new Judge();
        judge.setCategory(judgeDTO.getCategory());
        judge.setPersonalData(personalData);
        judge.setTournament(new ArmFightTournament());

        return judgeRepository.save(judge);
    }
}


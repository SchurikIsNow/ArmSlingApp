package bogdanov.converter;

import bogdanov.dto.TournamentDTO;
import bogdanov.entity.common.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TournamentConverterImpl implements TournamentConverter {

    @Autowired
    private WrestlerConverter wrestlerConverter;

    @Autowired
    private JudgeConverter judgeConverter;

    public TournamentDTO toDTO(Tournament tournament) {
        TournamentDTO tournamentDTO = new TournamentDTO();

        tournamentDTO.setId(tournament.getId());
        tournamentDTO.setAgeCategory(tournament.getAgeCategory());
        tournamentDTO.setMassCategory(tournament.getMassCategory());
        tournamentDTO.setBeginDate(tournament.getBeginDate());
        tournamentDTO.setPlace(tournament.getPlace());
        tournamentDTO.setSexCategory(tournament.getSexCategory());
        tournamentDTO.setTournamentType(tournament.getTournamentType());
        tournamentDTO.setWrestlers(wrestlerConverter.listToDTOs(tournament.getWrestlers()));
        tournamentDTO.setJudges(judgeConverter.listToDTOs(tournament.getJudges()));
        return tournamentDTO;
    }

    public List<TournamentDTO> listToDTOs(List<Tournament> tournaments) {
        List<TournamentDTO> tournamentDTOS = new ArrayList<TournamentDTO>();
        if (tournaments == null) {
            return tournamentDTOS;
        }
        for (Tournament tournament : tournaments) {
            tournamentDTOS.add(toDTO(tournament));
        }
        return tournamentDTOS;
    }

    public Tournament toEntity(TournamentDTO tournamentDTO) {
        Tournament tournament = new Tournament();

        tournament.setId(tournamentDTO.getId());
        tournament.setAgeCategory(tournamentDTO.getAgeCategory());
        tournament.setMassCategory(tournamentDTO.getMassCategory());
        tournament.setBeginDate(tournamentDTO.getBeginDate());
        tournament.setPlace(tournamentDTO.getPlace());
        tournament.setSexCategory(tournamentDTO.getSexCategory());
        tournament.setTournamentType(tournamentDTO.getTournamentType());
        tournament.setWrestlers(wrestlerConverter.listToEntitys(tournamentDTO.getWrestlers()));
        tournament.setJudges(judgeConverter.listToEntitys(tournamentDTO.getJudges()));

        return tournament;
    }

    public List<Tournament> listToEntitys(List<TournamentDTO> tournamentDTOS) {
        List<Tournament> tournaments = new ArrayList<Tournament>();

        if (tournamentDTOS == null) {
            return tournaments;
        }

        for (TournamentDTO tournamentDTO : tournamentDTOS) {
            tournaments.add(toEntity(tournamentDTO));
        }
        return tournaments;
    }
}

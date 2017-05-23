package bogdanov.converter;


import bogdanov.dto.TournamentDTO;
import bogdanov.entity.common.Tournament;

import java.util.List;

public interface TournamentConverter {

    TournamentDTO toDTO(Tournament tournament);

    List<TournamentDTO> listToDTOs(List<Tournament> tournaments);

    Tournament toEntity(TournamentDTO tournamentDTO);

    List<Tournament> listToEntitys(List<TournamentDTO> tournamentDTOs);
}

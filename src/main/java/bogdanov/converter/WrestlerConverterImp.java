package bogdanov.converter;

import bogdanov.dto.PersonalDataDTO;
import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Wrestler;
import bogdanov.entity.tournament.ArmFightTournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WrestlerConverterImp implements WrestlerConverter {

    @Autowired
    private PersonalDataConverter personalDataConverter;

    @Autowired
    private CityConverter cityConverter;

    @Autowired
    private TeamConverter teamConverter;

    public WrestlerDTO toDTO(Wrestler wrestler) {
        return toDTO(wrestler, personalDataConverter.toDTO(wrestler.getPersonalData()));
    }

    private WrestlerDTO toDTO(Wrestler wrestler, PersonalDataDTO personalDataDTO) {
        WrestlerDTO wrestlerDTO = new WrestlerDTO();
        wrestlerDTO.setMass(wrestler.getMass());
        wrestlerDTO.setId(wrestler.getId());
        wrestlerDTO.setPersonalData(personalDataDTO);
        wrestlerDTO.setCity(cityConverter.toDTO(wrestler.getCity()));
        wrestlerDTO.setTeam(teamConverter.toDTO(wrestler.getTeam()));
        return wrestlerDTO;
    }

    public List<WrestlerDTO> listToDTOs(List<Wrestler> wrestlers) {
        List<WrestlerDTO> wrestlerDTOs = new ArrayList<WrestlerDTO>();

        if (wrestlers == null) {
            return wrestlerDTOs;
        }

        for (Wrestler wrestler : wrestlers) {
            wrestlerDTOs.add(toDTO(wrestler));
        }
        return wrestlerDTOs;
    }

    public List<WrestlerDTO> listToDTOs(List<Wrestler> wrestlers, PersonalDataDTO personalDataDTO) {
        List<WrestlerDTO> wrestlerDTOs = new ArrayList<WrestlerDTO>();

        if (wrestlers == null) {
            return wrestlerDTOs;
        }

        for (Wrestler wrestler : wrestlers) {
            wrestlerDTOs.add(toDTO(wrestler, personalDataDTO));
        }
        return wrestlerDTOs;
    }


    public Wrestler toEntity(WrestlerDTO wrestlerDTO) {
        Wrestler wrestler = new Wrestler();

        wrestler.setMass(wrestlerDTO.getMass());
        wrestler.setPersonalData(personalDataConverter.toEntity(wrestlerDTO.getPersonalData()));
        wrestler.setTeam(teamConverter.toEntity(wrestlerDTO.getTeam()));
        wrestler.setCity(cityConverter.toEntity(wrestlerDTO.getCity()));
        wrestler.setTournament(new ArmFightTournament());

        return wrestler;
    }

    public List<Wrestler> listToEntitys(List<WrestlerDTO> wrestlerDTOs) {
        List<Wrestler> wrestlers = new ArrayList<Wrestler>();

        for (WrestlerDTO wrestlerDTO : wrestlerDTOs) {
            wrestlers.add(toEntity(wrestlerDTO));
        }
        return wrestlers;
    }

}

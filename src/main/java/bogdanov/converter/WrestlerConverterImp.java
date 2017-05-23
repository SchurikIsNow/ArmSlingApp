package bogdanov.converter;

import bogdanov.dto.WrestlerDTO;
import bogdanov.entity.common.Wrestler;
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
        WrestlerDTO wrestlerDTO = new WrestlerDTO();
        wrestlerDTO.setMass(wrestler.getMass());
        wrestlerDTO.setId(wrestler.getId());
        wrestlerDTO.setPersonalData(personalDataConverter.toDTO(wrestler.getPersonalData()));
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

    public Wrestler toEntity(WrestlerDTO wrestlerDTO) {
        Wrestler wrestler = new Wrestler();

        wrestler.setMass(wrestlerDTO.getMass());
        wrestler.setPersonalData(personalDataConverter.toEntity(wrestlerDTO.getPersonalData()));
        wrestler.setTeam(teamConverter.toEntity(wrestlerDTO.getTeam()));
        wrestler.setCity(cityConverter.toEntity(wrestlerDTO.getCity()));

        return wrestler;
    }

    public List<Wrestler> listToEntitys(List<WrestlerDTO> wrestlerDTOs) {
        List<Wrestler> wrestlers = new ArrayList<Wrestler>();

        if (wrestlerDTOs == null) {
            return wrestlers;
        }

        for (WrestlerDTO wrestlerDTO : wrestlerDTOs) {
            wrestlers.add(toEntity(wrestlerDTO));
        }
        return wrestlers;
    }

}

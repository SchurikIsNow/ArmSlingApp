package bogdanov.converter;

import bogdanov.dto.PersonalDataDTO;
import bogdanov.entity.common.PersonalData;

import java.util.List;

public interface PersonalDataConverter {

    PersonalDataDTO toDTO(PersonalData personalData);

    List<PersonalDataDTO> listToDTOs(List<PersonalData> personalDatas);

    PersonalData toEntity(PersonalDataDTO personalDataDTO);

    List<PersonalData> listToEntitys(List<PersonalDataDTO> personalDataDTOs);
}

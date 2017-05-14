package bogdanov.converter;

import bogdanov.dto.PersonalDataDTO;
import bogdanov.entity.common.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonalDataConverterImpl implements PersonalDataConverter {

    @Autowired
    private JudgeConverter judgeConverter;

    public PersonalDataDTO toDTO(PersonalData personalData) {
        PersonalDataDTO personalDataDTO = new PersonalDataDTO();

        personalDataDTO.setBirthDate(personalData.getBirthDate());
        personalDataDTO.setFirstName(personalData.getFirstName());
        personalDataDTO.setLastName(personalData.getLastName());
        personalDataDTO.setMiddleName(personalData.getMiddleName());
        personalDataDTO.setId(personalData.getId());
        personalDataDTO.setJudges(judgeConverter.listToDTOs(personalData.getJudges(), personalDataDTO));

        return personalDataDTO;
    }

    public List<PersonalDataDTO> listToDTOs(List<PersonalData> personalDatas) {
        List<PersonalDataDTO> personalDataDTOs = new ArrayList<PersonalDataDTO>();

        for (PersonalData personalData : personalDatas) {
            personalDataDTOs.add(toDTO(personalData));
        }
        return personalDataDTOs;
    }

    public PersonalData toEntity(PersonalDataDTO personalDataDTO) {
        PersonalData personalData = new PersonalData();

        personalData.setBirthDate(personalDataDTO.getBirthDate());
        personalData.setFirstName(personalDataDTO.getFirstName());
        personalData.setLastName(personalDataDTO.getLastName());
        personalData.setMiddleName(personalDataDTO.getMiddleName());
        personalData.setId(personalDataDTO.getId());

        return personalData;
    }

    public List<PersonalData> listToEntitys(List<PersonalDataDTO> personalDataDTOs) {
        List<PersonalData> personalDatas = new ArrayList<PersonalData>();

        for (PersonalDataDTO personalDataDTO : personalDataDTOs) {
            personalDatas.add(toEntity(personalDataDTO));
        }
        return personalDatas;
    }
}

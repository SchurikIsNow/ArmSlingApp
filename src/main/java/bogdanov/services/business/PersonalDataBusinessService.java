package bogdanov.services.business;

import bogdanov.entity.common.PersonalData;

import java.util.List;

public interface PersonalDataBusinessService {
    PersonalData createPetsonalData(PersonalData personalData);

    List<PersonalData> findAllPersonalDatas();
}

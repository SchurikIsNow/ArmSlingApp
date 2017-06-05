package bogdanov.services.business;

import bogdanov.entity.common.PersonalData;
import bogdanov.entity.request.find.PersonalDataRequest;

import java.util.List;

public interface PersonalDataBusinessService {
    PersonalData createPetsonalData(PersonalData personalData);

    List<PersonalData> findAll(PersonalDataRequest personalDataRequest);
}

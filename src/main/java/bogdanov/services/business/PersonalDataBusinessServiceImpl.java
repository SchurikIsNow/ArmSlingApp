package bogdanov.services.business;

import bogdanov.entity.common.PersonalData;
import bogdanov.repository.PersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonalDataBusinessServiceImpl implements PersonalDataBusinessService {
    @Autowired
    private PersonalDataRepository personalDataRepository;

    public List<PersonalData> findAllPersonalDatas() {
        return (List<PersonalData>) personalDataRepository.findAll();
    }

    public PersonalData createPetsonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }
}

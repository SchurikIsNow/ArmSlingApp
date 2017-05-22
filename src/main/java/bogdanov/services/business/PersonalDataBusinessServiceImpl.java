package bogdanov.services.business;

import bogdanov.entity.common.PersonalData;
import bogdanov.repository.PersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class PersonalDataBusinessServiceImpl implements PersonalDataBusinessService {
    @Autowired
    private PersonalDataRepository personalDataRepository;

    @Transactional
    public List<PersonalData> findAllPersonalDatas() {
        List<PersonalData> personalDatas = (List<PersonalData>) personalDataRepository.findAll();
        for (PersonalData personalData : personalDatas) {
            personalData.initLazyCollections();
        }
        return personalDatas;
    }

    public PersonalData createPetsonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }
}

package bogdanov.services.business;

import bogdanov.builders.predicate.PersonalDataPredicates;
import bogdanov.entity.common.PersonalData;
import bogdanov.entity.common.QPersonalData;
import bogdanov.entity.request.find.PersonalDataRequest;
import bogdanov.repository.PersonalDataRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonalDataBusinessServiceImpl implements PersonalDataBusinessService {

    @Autowired
    private PersonalDataRepository personalDataRepository;

    public PersonalData createPetsonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }

    public List<PersonalData> findAll(PersonalDataRequest personalDataRequest) {
        BooleanBuilder filter = PersonalDataPredicates.getPersonalDataFilter(QPersonalData.personalData, personalDataRequest);
        return (List<PersonalData>) personalDataRepository.findAll(filter);
    }
}

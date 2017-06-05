package bogdanov.builders.predicate;


import bogdanov.entity.common.QPersonalData;
import bogdanov.entity.request.PersonalDataRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;

public class PersonalDataPredicates {

    public static BooleanBuilder getPersonalDataFilter(QPersonalData qPersonalData, PersonalDataRequest personalDataRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(personalDataRequest.getFirstName()))
            filter.and(qPersonalData.firstName.startsWithIgnoreCase(personalDataRequest.getFirstName()));

        if (!StringUtils.isEmpty(personalDataRequest.getLastName()))
            filter.and(qPersonalData.lastName.startsWithIgnoreCase(personalDataRequest.getLastName()));

        if (!StringUtils.isEmpty(personalDataRequest.getMiddleName()))
            filter.and(qPersonalData.middleName.startsWithIgnoreCase(personalDataRequest.getMiddleName()));

        if (!StringUtils.isEmpty(personalDataRequest.getBirthDate()))
            filter.and(qPersonalData.birthDate.eq(personalDataRequest.getBirthDate()));


        return filter;
    }
}


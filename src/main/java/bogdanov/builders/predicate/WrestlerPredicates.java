package bogdanov.builders.predicate;

import bogdanov.entity.common.QWrestler;
import bogdanov.entity.request.find.AddressRequest;
import bogdanov.entity.request.find.PersonalDataRequest;
import bogdanov.entity.request.find.TeamRequest;
import bogdanov.entity.request.find.WrestlerRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;


public class WrestlerPredicates {


    public static BooleanBuilder getWrestlerFilter(QWrestler qWrestler, WrestlerRequest wrestlerRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (wrestlerRequest.getMass() != null)
            filter.and(qWrestler.mass.eq(wrestlerRequest.getMass()));

        if (wrestlerRequest.getRating() != null)
            filter.and(qWrestler.rating.eq(wrestlerRequest.getRating()));

        PersonalDataRequest personalDataRequest = wrestlerRequest.getPersonalData();
        if (personalDataRequest != null)
            filter.and(PersonalDataPredicates.getPersonalDataFilter(qWrestler.personalData, personalDataRequest));

        AddressRequest addressRequest = wrestlerRequest.getAddress();
        if (addressRequest != null)
            filter.and((AddressPredicates.getAddressFilter(qWrestler.address, addressRequest)));

        TeamRequest teamRequest = wrestlerRequest.getTeam();
        if (teamRequest != null)
            filter.and((TeamPredicates.getTeamFilter(qWrestler.team, teamRequest)));

        if (!StringUtils.isEmpty(wrestlerRequest.getLevel()))
            filter.and(qWrestler.level.eq(wrestlerRequest.getLevel()));


        return filter;
    }
}

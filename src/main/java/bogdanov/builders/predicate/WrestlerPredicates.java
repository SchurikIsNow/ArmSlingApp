package bogdanov.builders.predicate;

import bogdanov.entity.common.QWrestler;
import bogdanov.entity.request.CityRequest;
import bogdanov.entity.request.PersonalDataRequest;
import bogdanov.entity.request.TeamRequest;
import bogdanov.entity.request.WrestlerRequest;
import com.querydsl.core.BooleanBuilder;


public class WrestlerPredicates {


    public static BooleanBuilder getWrestlerFilter(QWrestler qWrestler, WrestlerRequest wrestlerRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (wrestlerRequest.getMass() != null)
            filter.and(qWrestler.mass.eq(wrestlerRequest.getMass()));

        PersonalDataRequest personalDataRequest = wrestlerRequest.getPersonalData();
        if (personalDataRequest != null)
            filter.and(PersonalDataPredicates.getPersonalDataFilter(qWrestler.personalData, personalDataRequest));

        CityRequest cityRequest = wrestlerRequest.getCity();
        if (cityRequest != null)
            filter.and((CityPredicates.getCityFilter(qWrestler.city, cityRequest)));

        TeamRequest teamRequest = wrestlerRequest.getTeam();
        if (teamRequest != null)
            filter.and((TeamPredicates.getTeamFilter(qWrestler.team, teamRequest)));


        return filter;
    }
}

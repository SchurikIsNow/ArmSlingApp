package bogdanov.builders.predicate;


import bogdanov.entity.common.QTeam;
import bogdanov.entity.request.find.TeamRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;

public class TeamPredicates {

    public static BooleanBuilder getTeamFilter(QTeam qTeam, TeamRequest teamRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(teamRequest.getTeamName()))
            filter.and(qTeam.teamName.startsWithIgnoreCase(teamRequest.getTeamName()));

        return filter;
    }
}

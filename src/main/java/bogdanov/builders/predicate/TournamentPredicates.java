package bogdanov.builders.predicate;


import bogdanov.entity.common.QTournament;
import bogdanov.entity.request.find.TournamentRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;

public class TournamentPredicates {
    public static BooleanBuilder getTournamentFilter(QTournament qTournament, TournamentRequest tournamentRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(tournamentRequest.getAgeCategory()))
            filter.and(qTournament.ageCategory.startsWithIgnoreCase(tournamentRequest.getAgeCategory()));

        if (!StringUtils.isEmpty(tournamentRequest.getMassCategory()))
            filter.and(qTournament.massCategory.startsWithIgnoreCase(tournamentRequest.getMassCategory()));

        if (!StringUtils.isEmpty(tournamentRequest.getBeginDate()))
            filter.and(qTournament.beginDate.eq(tournamentRequest.getBeginDate()));

        if (!StringUtils.isEmpty(tournamentRequest.getPlace()))
            filter.and(qTournament.place.startsWithIgnoreCase(tournamentRequest.getPlace()));

        if (!StringUtils.isEmpty(tournamentRequest.getSexCategory()))
            filter.and(qTournament.sexCategory.eq(tournamentRequest.getSexCategory()));

        if (!StringUtils.isEmpty(tournamentRequest.getTournamentType()))
            filter.and(qTournament.tournamentType.eq(tournamentRequest.getTournamentType()));

        return filter;
    }
}

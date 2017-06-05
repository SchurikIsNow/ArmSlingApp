package bogdanov.builders.predicate;


import bogdanov.entity.common.QJudge;
import bogdanov.entity.request.JudgeRequest;
import bogdanov.entity.request.PersonalDataRequest;
import com.querydsl.core.BooleanBuilder;
import org.apache.commons.lang3.StringUtils;

public class JudgePredicates {

    public static BooleanBuilder getJudgeFilter(QJudge qJudge, JudgeRequest judgeRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(judgeRequest.getCategory()))
            filter.and(qJudge.category.startsWithIgnoreCase(judgeRequest.getCategory()));

        PersonalDataRequest personalDataRequest = judgeRequest.getPersonalDataRequest();
        if (personalDataRequest != null)
            filter.and(PersonalDataPredicates.getPersonalDataFilter(qJudge.personalData, personalDataRequest));

        return filter;
    }
}

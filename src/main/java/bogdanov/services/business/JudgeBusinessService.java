package bogdanov.services.business;


import bogdanov.entity.common.Judge;

import java.util.List;

public interface JudgeBusinessService {

    Judge createJudge(Judge judge);

    List<Judge> findAllJudges();
}

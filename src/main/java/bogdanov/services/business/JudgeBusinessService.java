package bogdanov.services.business;


import bogdanov.entity.common.Judge;
import bogdanov.entity.request.find.JudgeRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JudgeBusinessService {

    Judge createJudge(Judge judge);

    Page<Judge> findAllJudges(Pageable pageable);

    List<Judge> findAll(JudgeRequest judgeRequest);
}

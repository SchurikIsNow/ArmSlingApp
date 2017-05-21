package bogdanov.services.business;


import bogdanov.entity.common.Judge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface JudgeBusinessService {

    Judge createJudge(Judge judge);

    List<Judge> findAllJudges();

    Page<Judge> findAllJudges(Pageable pageable);
}

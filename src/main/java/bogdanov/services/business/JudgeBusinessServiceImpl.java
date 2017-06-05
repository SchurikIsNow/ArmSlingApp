package bogdanov.services.business;

import bogdanov.builders.predicate.JudgePredicates;
import bogdanov.entity.common.Judge;
import bogdanov.entity.common.QJudge;
import bogdanov.entity.request.JudgeRequest;
import bogdanov.repository.JudgeRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JudgeBusinessServiceImpl implements JudgeBusinessService {

    @Autowired
    private JudgeRepository judgeRepository;

    public Judge createJudge(Judge judge) {
        return judgeRepository.save(judge);
    }

    public Page<Judge> findAllJudges(Pageable pageable) {
        return judgeRepository.findAll(pageable);
    }

    public List<Judge> findAll(JudgeRequest judgeRequest) {
        BooleanBuilder filter = JudgePredicates.getJudgeFilter(QJudge.judge, judgeRequest);
        return (List<Judge>) judgeRepository.findAll(filter);
    }

}

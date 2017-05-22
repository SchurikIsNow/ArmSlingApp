package bogdanov.services.business;

import bogdanov.entity.common.Judge;
import bogdanov.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JudgeBusinessServiceImpl implements JudgeBusinessService {

    @Autowired
    private JudgeRepository judgeRepository;

    public List<Judge> findAllJudges() {
        return (List<Judge>) judgeRepository.findAll();
    }

    public Judge createJudge(Judge judge) {
        return judgeRepository.save(judge);
    }

    public Page<Judge> findAllJudges(Pageable pageable) {
        return judgeRepository.findAll(pageable);
    }

}

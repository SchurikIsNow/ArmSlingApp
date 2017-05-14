package bogdanov.services.business;

import bogdanov.entity.common.Judge;
import bogdanov.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class JudgeBusinessServiceImpl implements JudgeBusinessService {

    @Autowired
    private JudgeRepository judgeRepository;

    @Transactional
    public List<Judge> findAllJudges() {
        List<Judge> judges = (List<Judge>) judgeRepository.findAll();
        for (Judge judge : judges) {
            judge.getPersonalData().initLazyCollections();
        }
        return judges;
    }

    public Judge createJudge(Judge judge) {
        return judgeRepository.save(judge);
    }

}

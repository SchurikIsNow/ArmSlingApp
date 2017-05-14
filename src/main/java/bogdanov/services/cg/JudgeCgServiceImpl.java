package bogdanov.services.cg;

import bogdanov.converter.JudgeConverter;
import bogdanov.dto.JudgeDTO;
import bogdanov.entity.common.Judge;
import bogdanov.services.business.JudgeBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JudgeCgServiceImpl implements JudgeCgService {

    @Autowired
    private JudgeBusinessService judgeBusinessService;

    @Autowired
    private JudgeConverter judgeConverter;

    public JudgeDTO createJudge(JudgeDTO judgeDTO) {
        Judge judge = judgeConverter.toEntity(judgeDTO);
        Judge createdJudge = judgeBusinessService.createJudge(judge);
        return judgeConverter.toDTO(createdJudge);
    }

    public List<JudgeDTO> findAllJudges() {
        List<Judge> judges = judgeBusinessService.findAllJudges();
        return judgeConverter.listToDTOs(judges);
    }
}

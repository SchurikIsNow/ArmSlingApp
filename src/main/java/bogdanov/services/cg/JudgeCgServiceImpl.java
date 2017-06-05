package bogdanov.services.cg;

import bogdanov.dto.JudgeDTO;
import bogdanov.dto.request.JudgeRequestDTO;
import bogdanov.entity.common.Judge;
import bogdanov.entity.request.JudgeRequest;
import bogdanov.services.AbstractService;
import bogdanov.services.business.JudgeBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JudgeCgServiceImpl extends AbstractService implements JudgeCgService {

    @Autowired
    private JudgeBusinessService judgeBusinessService;


    public JudgeDTO createJudge(JudgeDTO judgeDTO) {
        Judge judge = mappingService.map(judgeDTO, Judge.class);
        Judge createdJudge = judgeBusinessService.createJudge(judge);
        return mappingService.map(createdJudge, JudgeDTO.class);
    }

    public List<JudgeDTO> findAllJudges(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Judge> judges = judgeBusinessService.findAllJudges(new PageRequest(page, size, direction, properties));
        return mappingService.mapList(judges.getContent(), JudgeDTO.class);

    }

    public List<JudgeDTO> findAll(JudgeRequestDTO judgeRequestDTO) {
        JudgeRequest judgeRequest = mappingService.map(judgeRequestDTO, JudgeRequest.class);
        List<Judge> judges = judgeBusinessService.findAll(judgeRequest);
        return mappingService.mapList(judges, JudgeDTO.class);
    }
}

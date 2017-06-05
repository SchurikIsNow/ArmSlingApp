package bogdanov.services.cg;

import bogdanov.converter.JudgeConverter;
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

    public List<JudgeDTO> findAllJudges(int page, int size, Sort.Direction direction, String[] properties) {
        Page<Judge> judges = judgeBusinessService.findAllJudges(new PageRequest(page, size, direction, properties));
        return judgeConverter.listToDTOs(judges.getContent());

    }

    public List<JudgeDTO> findAll(JudgeRequestDTO judgeRequestDTO) {
        JudgeRequest judgeRequest = mappingService.map(judgeRequestDTO, JudgeRequest.class);
        List<Judge> judges = judgeBusinessService.findAll(judgeRequest);
        return mappingService.mapList(judges, JudgeDTO.class);
    }
}

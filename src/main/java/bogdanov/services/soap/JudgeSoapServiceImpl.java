package bogdanov.services.soap;


import bogdanov.dto.JudgeDTO;
import bogdanov.services.cg.JudgeCgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JudgeSoapServiceImpl implements JudgeSoapService {

    @Autowired
    private JudgeCgService judgeCgService;

    public List<JudgeDTO> findAllJudgesWithFilter(int page, int size, Sort.Direction direction, String[] properties) {
        return judgeCgService.findAllJudges(page, size, direction, properties);
    }

    public List<JudgeDTO> findAllJudges() {
        return judgeCgService.findAllJudges();
    }

    public JudgeDTO createJudge(JudgeDTO judgeDTO) {
        return judgeCgService.createJudge(judgeDTO);
    }


}

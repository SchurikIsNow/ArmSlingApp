package bogdanov.services.cg;


import bogdanov.dto.JudgeDTO;
import bogdanov.dto.request.JudgeRequestDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface JudgeCgService {

    JudgeDTO createJudge(JudgeDTO judgeDTO);

    List<JudgeDTO> findAllJudges();

    List<JudgeDTO> findAllJudges(int page, int size, Sort.Direction direction, String[] properties);

    List<JudgeDTO> findAll(JudgeRequestDTO judgeRequestDTO);

}

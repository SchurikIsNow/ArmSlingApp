package bogdanov.services.cg;


import bogdanov.dto.JudgeDTO;

import java.util.List;

public interface JudgeCgService {

    JudgeDTO createJudge(JudgeDTO judgeDTO);

    List<JudgeDTO> findAllJudges();

}

package bogdanov.services.soap;


import bogdanov.dto.JudgeDTO;
import bogdanov.dto.request.JudgeRequestDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface JudgeSoapService {

    @WebMethod
    List<JudgeDTO> findAllJudgesWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    JudgeDTO createJudge(JudgeDTO judgeDTO);

    @WebMethod
    List<JudgeDTO> findAll(JudgeRequestDTO judgeRequestDTO);

}

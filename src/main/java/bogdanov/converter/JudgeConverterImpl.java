package bogdanov.converter;

import bogdanov.dto.JudgeDTO;
import bogdanov.entity.common.Judge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JudgeConverterImpl implements JudgeConverter {

    @Autowired
    private PersonalDataConverter personalDataConverter;

    public JudgeDTO toDTO(Judge judge) {
        JudgeDTO judgeDTO = new JudgeDTO();

        judgeDTO.setCategory(judge.getCategory());
        judgeDTO.setId(judge.getId());
        judgeDTO.setPersonalData(personalDataConverter.toDTO(judge.getPersonalData()));

        return judgeDTO;
    }

    public List<JudgeDTO> listToDTOs(List<Judge> judges) {
        List<JudgeDTO> judgeDTOs = new ArrayList<JudgeDTO>();

        if (judges == null) {
            return judgeDTOs;
        }

        for (Judge judge : judges) {
            judgeDTOs.add(toDTO(judge));
        }
        return judgeDTOs;
    }

    public Judge toEntity(JudgeDTO judgeDTO) {
        Judge judge = new Judge();

        judge.setCategory(judgeDTO.getCategory());
        judge.setPersonalData(personalDataConverter.toEntity(judgeDTO.getPersonalData()));

        return judge;
    }

    public List<Judge> listToEntitys(List<JudgeDTO> judgeDTOs) {
        List<Judge> judges = new ArrayList<Judge>();

        for (JudgeDTO judgeDTO : judgeDTOs) {
            judges.add(toEntity(judgeDTO));
        }
        return judges;
    }
}

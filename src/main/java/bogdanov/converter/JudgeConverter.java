package bogdanov.converter;

import bogdanov.dto.JudgeDTO;
import bogdanov.dto.PersonalDataDTO;
import bogdanov.entity.common.Judge;

import java.util.List;

public interface JudgeConverter {

    JudgeDTO toDTO(Judge judge);

    List<JudgeDTO> listToDTOs(List<Judge> judges);

    List<JudgeDTO> listToDTOs(List<Judge> judges, PersonalDataDTO personalDataDTO);

    Judge toEntity(JudgeDTO judgeDTO);

    List<Judge> listToEntitys(List<JudgeDTO> judgeDTOs);
}

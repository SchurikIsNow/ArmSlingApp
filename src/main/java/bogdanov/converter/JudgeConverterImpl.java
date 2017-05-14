package bogdanov.converter;

import bogdanov.dto.JudgeDTO;
import bogdanov.dto.PersonalDataDTO;
import bogdanov.entity.common.Judge;
import bogdanov.entity.tournament.ArmFightTournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JudgeConverterImpl implements JudgeConverter {

    @Autowired
    private PersonalDataConverter personalDataConverter;

    public JudgeDTO toDTO(Judge judge) {
        return toDTO(judge, personalDataConverter.toDTO(judge.getPersonalData()));
    }

    private JudgeDTO toDTO(Judge judge, PersonalDataDTO personalDataDTO) {
        JudgeDTO judgeDTO = new JudgeDTO();

        judgeDTO.setCategory(judge.getCategory());
        judgeDTO.setId(judge.getId());
        judgeDTO.setPersonalData(personalDataDTO);

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

    public List<JudgeDTO> listToDTOs(List<Judge> judges, PersonalDataDTO personalDataDTO) {
        List<JudgeDTO> judgeDTOs = new ArrayList<JudgeDTO>();

        if (judges == null) {
            return judgeDTOs;
        }

        for (Judge judge : judges) {
            judgeDTOs.add(toDTO(judge, personalDataDTO));
        }
        return judgeDTOs;
    }

    public Judge toEntity(JudgeDTO judgeDTO) {
        Judge judge = new Judge();

        judge.setCategory(judgeDTO.getCategory());
        judge.setPersonalData(personalDataConverter.toEntity(judgeDTO.getPersonalData()));
        judge.setTournament(new ArmFightTournament()); //TODO add tournament from DTO

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

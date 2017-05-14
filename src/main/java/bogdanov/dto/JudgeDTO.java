package bogdanov.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class JudgeDTO {

    private Long id;
    private String category;
    private PersonalDataDTO personalData;

}

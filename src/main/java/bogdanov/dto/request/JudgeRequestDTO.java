package bogdanov.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JudgeRequestDTO {
    String category;
    PersonalDataRequestDTO personalDataRequestDTO;
}

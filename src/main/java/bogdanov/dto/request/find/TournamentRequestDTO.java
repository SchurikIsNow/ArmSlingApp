package bogdanov.dto.request.find;

import bogdanov.entity.common.Address;
import bogdanov.entity.enums.SexEnum;
import bogdanov.entity.enums.TournamentTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TournamentRequestDTO {
    String ageCategory;
    String massCategory;
    Date beginDate;
    TournamentTypeEnum tournamentType;
    SexEnum sexCategory;
    Address address;


//     List<WrestlerDTO> wrestlers;
//     List<JudgeDTO> judges;
}

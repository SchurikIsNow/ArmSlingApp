package bogdanov.entity.request.find;

import bogdanov.entity.enums.SexEnum;
import bogdanov.entity.enums.TournamentTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TournamentRequest {
    String ageCategory;
    String massCategory;
    String place;
    Date beginDate;
    TournamentTypeEnum tournamentType;
    SexEnum sexCategory;

//    List<WrestlerDTO> wrestlers;
//    List<JudgeDTO> judges;
}

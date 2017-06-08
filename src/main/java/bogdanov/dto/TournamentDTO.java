package bogdanov.dto;


import bogdanov.entity.enums.AgeCategoryEnum;
import bogdanov.entity.enums.MassCategoryEnum;
import bogdanov.entity.enums.SexEnum;
import bogdanov.entity.enums.TournamentTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class TournamentDTO {

    private Long id;
    private AgeCategoryEnum ageCategory;
    private MassCategoryEnum massCategory;
    private Date beginDate;
    private TournamentTypeEnum tournamentType;
    private SexEnum sexCategory;
    private AddressDTO address;

    private List<WrestlerDTO> wrestlers;
    private List<JudgeDTO> judges;
}

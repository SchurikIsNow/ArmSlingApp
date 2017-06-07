package bogdanov.dto.request.find;

import bogdanov.entity.enums.LevelEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerRequestDTO {

    Integer mass;
    Integer rating;
    TeamRequestDTO team;
    AddressRequestDTO exactAddress;
    PersonalDataRequestDTO personalData;
    LevelEnum level;
}

package bogdanov.entity.request.find;

import bogdanov.entity.enums.LevelEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerRequest {

    Integer mass;
    Integer rating;
    TeamRequest team;
    AddressRequest address;
    PersonalDataRequest personalData;
    LevelEnum level;
}

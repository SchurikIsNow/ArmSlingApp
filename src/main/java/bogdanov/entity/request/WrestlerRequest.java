package bogdanov.entity.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerRequest {

    Integer mass;
    TeamRequest team;
    CityRequest city;
    PersonalDataRequest personalData;
}

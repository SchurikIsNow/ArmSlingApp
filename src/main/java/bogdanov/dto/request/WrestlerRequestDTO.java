package bogdanov.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerRequestDTO {

    Integer mass;
    TeamRequestDTO team;
    CityRequestDTO city;
    PersonalDataRequestDTO personalData;
}

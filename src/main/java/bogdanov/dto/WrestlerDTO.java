package bogdanov.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerDTO {

    private Long id;
    private Integer mass;
    private TeamDTO team;
    private CityDTO city;
    private PersonalDataDTO personalData;

}

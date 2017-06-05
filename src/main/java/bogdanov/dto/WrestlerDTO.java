package bogdanov.dto;


import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Getter
@Setter
@XmlAccessorType(value = XmlAccessType.FIELD)
public class WrestlerDTO {

    private Long id;
    private Integer mass;
    private TeamDTO team;
    private CityDTO city;
    private PersonalDataDTO personalData;

    @XmlTransient
    private TournamentDTO tournament;
}

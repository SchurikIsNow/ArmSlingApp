package bogdanov.dto;


import bogdanov.entity.enums.LevelEnum;
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
    private Integer rating;
    private TeamDTO team;
    private AddressDTO address;
    private PersonalDataDTO personalData;
    private LevelEnum level;

    @XmlTransient
    private TournamentDTO tournament;
}

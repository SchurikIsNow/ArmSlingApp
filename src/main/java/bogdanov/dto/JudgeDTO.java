package bogdanov.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;


@Getter
@Setter
@XmlAccessorType(value = XmlAccessType.FIELD)
public class JudgeDTO {

    private Long id;
    private String category;
    private PersonalDataDTO personalData;

    @XmlTransient
    private TournamentDTO tournament;
}

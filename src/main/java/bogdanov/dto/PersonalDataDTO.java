package bogdanov.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

@Getter
@Setter
@XmlAccessorType(value = XmlAccessType.FIELD)
public class PersonalDataDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;

}

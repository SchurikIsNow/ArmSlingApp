package bogdanov.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonalDataDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
}

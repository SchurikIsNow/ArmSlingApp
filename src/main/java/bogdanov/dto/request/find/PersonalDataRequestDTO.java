package bogdanov.dto.request.find;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonalDataRequestDTO {
    String firstName;
    String lastName;
    String middleName;
    Date birthDate;
}

package bogdanov.entity.request.find;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonalDataRequest {
    String firstName;
    String lastName;
    String middleName;
    Date birthDate;
}

package bogdanov.entity.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pers_personaldata")
@SequenceGenerator(name = "pers_personaldata_seq", sequenceName = "pers_personaldata_seq", allocationSize = 1)
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_personaldata_seq")
    private Long id;

    private String firstName;
    private String lastName;
    private String middleName;

    private Date birthDate;

}

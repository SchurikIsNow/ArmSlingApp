package bogdanov.entity.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "personalData")
    private List<Judge> judges;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "personalData")
    private List<Wrestler> wrestlers;

    public void initLazyCollections() {
        judges.size();
        wrestlers.size();
    }
}

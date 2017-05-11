package bogdanov.entity.common;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_city")
@SequenceGenerator(name = "pers_city_seq", sequenceName = "pers_city_seq", allocationSize = 1)
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_city_seq")
    private Long id;
    private String cityName;

}

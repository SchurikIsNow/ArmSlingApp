package bogdanov.entity.common;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pers_address")
@SequenceGenerator(name = "pers_address_seq", sequenceName = "pers_address_seq", allocationSize = 1)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_address_seq")
    private Long id;
    private String city;
    private String country;
    private String region;
    private String exactAddress;

}

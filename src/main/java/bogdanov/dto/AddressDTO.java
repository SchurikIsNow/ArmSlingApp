package bogdanov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {


    private Long id;
    private String city;
    private String exactAddress;
    private String country;
    private String region;
}

package bogdanov.entity.request.find;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {
    String city;
    String region;
    String country;
    String exactAddress;
}

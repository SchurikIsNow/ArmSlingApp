package bogdanov.services;


import bogdanov.services.mapping.MappingService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public abstract class AbstractService {

    @Autowired
    protected MappingService mappingService;

}

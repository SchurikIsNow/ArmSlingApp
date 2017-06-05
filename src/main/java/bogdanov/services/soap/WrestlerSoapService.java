package bogdanov.services.soap;

import bogdanov.dto.WrestlerDTO;
import bogdanov.dto.request.create.WrestlerCreateRequestDTO;
import bogdanov.dto.request.find.WrestlerRequestDTO;
import org.springframework.data.domain.Sort;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface WrestlerSoapService {

    @WebMethod
    WrestlerDTO createWrestler(WrestlerCreateRequestDTO requestDTO);

    @WebMethod
    List<WrestlerDTO> findAllWrestlersWithFilter(int page, int size, Sort.Direction direction, String[] properties);

    @WebMethod
    List<WrestlerDTO> findAll(WrestlerRequestDTO wrestlerRequestDTO);
}

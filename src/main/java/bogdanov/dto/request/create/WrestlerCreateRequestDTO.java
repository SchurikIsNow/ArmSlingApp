package bogdanov.dto.request.create;


import bogdanov.dto.WrestlerDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WrestlerCreateRequestDTO {
    WrestlerDTO wrestlerDTO;
    long tournamentId;
}

package bogdanov.entity.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JudgeRequest {
    String category;
    PersonalDataRequest personalDataRequest;
}

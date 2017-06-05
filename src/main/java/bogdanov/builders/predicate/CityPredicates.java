package bogdanov.builders.predicate;


import bogdanov.entity.common.QCity;
import bogdanov.entity.request.CityRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;

public class CityPredicates {
    public static BooleanBuilder getCityFilter(QCity qCity, CityRequest cityRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(cityRequest.getCityName()))
            filter.and(qCity.cityName.startsWithIgnoreCase(cityRequest.getCityName()));

        return filter;
    }
}

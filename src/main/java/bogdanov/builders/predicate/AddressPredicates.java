package bogdanov.builders.predicate;


import bogdanov.entity.common.QAddress;
import bogdanov.entity.request.find.AddressRequest;
import com.querydsl.core.BooleanBuilder;
import org.springframework.util.StringUtils;

public class AddressPredicates {
    public static BooleanBuilder getAddressFilter(QAddress qAddress, AddressRequest addressRequest) {

        BooleanBuilder filter = new BooleanBuilder();

        if (!StringUtils.isEmpty(addressRequest.getExactAddress()))
            filter.and(qAddress.exactAddress.startsWithIgnoreCase(addressRequest.getExactAddress()));

        if (!StringUtils.isEmpty(addressRequest.getRegion()))
            filter.and(qAddress.region.startsWithIgnoreCase(addressRequest.getRegion()));

        if (!StringUtils.isEmpty(addressRequest.getCity()))
            filter.and(qAddress.city.startsWithIgnoreCase(addressRequest.getCity()));

        if (!StringUtils.isEmpty(addressRequest.getCountry()))
            filter.and(qAddress.country.startsWithIgnoreCase(addressRequest.getCountry()));

        return filter;
    }
}

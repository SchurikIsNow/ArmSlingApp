package bogdanov.services.mapping;


import java.util.List;


public interface MappingService {

    <T> T map(Object src, Class<T> targetClass);

    void map(Object src, Object target);

    <T> List<T> mapList(List src, Class<T> targetClass);
}

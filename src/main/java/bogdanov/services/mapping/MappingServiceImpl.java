package bogdanov.services.mapping;

import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MappingServiceImpl implements MappingService {

    @Autowired
    private DozerBeanMapperFactoryBean dozerBeanFactory;

    public <T> T map(Object src, Class<T> targetClass) {
        try {
            Mapper mapper = dozerBeanFactory.getObject();
            return mapper.map(src, targetClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void map(Object src, Object target) {
        try {
            Mapper mapper = dozerBeanFactory.getObject();
            mapper.map(src, target);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> mapList(List src, Class<T> targetClass) {
        List<T> listTgt = new ArrayList<T>();
        if (src != null) {
            for (Object objSrc : src) {
                Object objTgt = this.map(objSrc, targetClass);
                if (objTgt != null) {
                    listTgt.add((T) objTgt);
                }
            }
        }
        return listTgt;
    }
}

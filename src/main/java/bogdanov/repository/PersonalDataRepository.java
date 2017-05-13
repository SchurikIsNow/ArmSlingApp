package bogdanov.repository;


import bogdanov.entity.common.PersonalData;
import org.springframework.data.repository.CrudRepository;

public interface PersonalDataRepository extends CrudRepository<PersonalData, Long> {
}

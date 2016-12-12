package bogdanov.repository;


import bogdanov.entity.personal.PersonalData;
import org.springframework.data.repository.CrudRepository;

public interface PersonalDataRepository extends CrudRepository<PersonalData, Long>{
}

package bogdanov.repository;


import bogdanov.entity.common.PersonalData;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonalDataRepository extends PagingAndSortingRepository<PersonalData, Long> {
}

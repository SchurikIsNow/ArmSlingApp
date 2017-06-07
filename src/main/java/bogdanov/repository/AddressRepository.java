package bogdanov.repository;


import bogdanov.entity.common.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;


public interface AddressRepository extends JpaRepository<Address, Long>, QueryDslPredicateExecutor<Address> {

}

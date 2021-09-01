package eu.primeiraApi.personApi.personApi.repository;

import eu.primeiraApi.personApi.personApi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person,Long> {
}

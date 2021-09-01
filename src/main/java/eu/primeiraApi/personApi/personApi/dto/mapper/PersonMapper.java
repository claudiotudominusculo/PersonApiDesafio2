package eu.primeiraApi.personApi.personApi.dto.mapper;



import eu.primeiraApi.personApi.personApi.dto.mapper.request.PersonDTO;
import eu.primeiraApi.personApi.personApi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

        @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
        Person toModel(PersonDTO dto);

        PersonDTO toDTO(Person dto);
}

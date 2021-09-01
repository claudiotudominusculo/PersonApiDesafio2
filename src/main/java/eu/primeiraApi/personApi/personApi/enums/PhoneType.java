package eu.primeiraApi.personApi.personApi.enums;

import com.fasterxml.jackson.databind.util.ClassUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME ("Home"),
    MOBILE ("Mobile"),
    COMMERCIAL ("Commercial");

    private final String description;


}

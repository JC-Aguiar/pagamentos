package br.com.jcaguiar.pagamentos.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public class MasterModel {

    LocalDateTime creationDate = LocalDateTime.parse(
            LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    );

    LocalDateTime activationDate = null;

    LocalDateTime deactivationDate = null;

    public MasterModel getSelf() {
        return this;
    }


}

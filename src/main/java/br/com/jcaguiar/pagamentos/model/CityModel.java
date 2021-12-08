package br.com.jcaguiar.pagamentos.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Locale;
import java.util.Optional;

@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "city")
public class CityModel extends MasterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull @Column(nullable = false)
    String name;

    @Column(nullable = false, unique = true)
    String completeName;

    @NonNull @ManyToOne(fetch = FetchType.LAZY)
    StateModel state;

    public void setState(StateModel state) {
        this.state = state;
        setCompleteName();
    }

    public String getCompleteName() {
        setCompleteName();
        return completeName;
    }

    public void setCompleteName() {
        Optional.of(state).ifPresentOrElse(this::setCompleteName, this::noCompleteName);
    }

    private void setCompleteName(@NonNull StateModel state) {
        completeName = (state.getCompleteName() + name).toUpperCase(Locale.ROOT);
    }

    private void noCompleteName() {
        completeName = name;
    }

}

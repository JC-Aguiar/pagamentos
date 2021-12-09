package br.com.jcaguiar.pagamentos.model.places;

import br.com.jcaguiar.pagamentos.model.places.CityModel;
import br.com.jcaguiar.pagamentos.model.places.CountryModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "state")
public class StateModel implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull @Column(nullable = false)
    String name;

    @Column(nullable = false, unique = true)
    String completeName;

    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<CityModel> cities = new ArrayList<>();

    @NonNull @ManyToOne
    CountryModel country;

    public void setCountry(@NonNull CountryModel country) {
        this.country = country;
    }

    public String getCompleteName() {
        setCompleteName();
        return completeName;
    }

    public void setCompleteName() {
        Optional.of(country).ifPresentOrElse(this::getCompleteName, this::noCompleteName);
    }

    private void getCompleteName(@NonNull CountryModel country) {
        completeName = (country.getName() + name).toUpperCase(Locale.ROOT);
    }

    private void noCompleteName() {
        completeName = name;
    }
}

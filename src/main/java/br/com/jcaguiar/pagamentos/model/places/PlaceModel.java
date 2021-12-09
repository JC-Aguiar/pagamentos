package br.com.jcaguiar.pagamentos.model.places;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import br.com.jcaguiar.pagamentos.model.client.ClientModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "place")
public class PlaceModel extends MasterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String number;

    String complement;

    String neighbourhood;

    @Column(nullable = false)
    String postal;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    ClientModel client;

}

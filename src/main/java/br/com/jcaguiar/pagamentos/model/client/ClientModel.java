package br.com.jcaguiar.pagamentos.model.client;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import br.com.jcaguiar.pagamentos.model.order.OrderModel;
import br.com.jcaguiar.pagamentos.model.places.PlaceModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "client")
public class ClientModel extends MasterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false, unique = true)
    String document;

    @Column(nullable = false)
    ClientEnum type;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<OrderModel> orders = new ArrayList<>();

    @NonNull @Column(nullable = false)
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<PlaceModel> places = new ArrayList<>();

}

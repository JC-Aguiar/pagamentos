package br.com.jcaguiar.pagamentos.model.order;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import br.com.jcaguiar.pagamentos.model.product.ProductModel;
import br.com.jcaguiar.pagamentos.model.client.ClientModel;
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
@Entity(name = "order")
final public class OrderModel extends MasterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull @ManyToMany
    @JoinTable( name = "order_item",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "product_id"))
    List<ProductModel> produts = new ArrayList<>();

    @NonNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    ClientModel client;

    @NonNull
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    PlaceModel deliveryPlace;
}

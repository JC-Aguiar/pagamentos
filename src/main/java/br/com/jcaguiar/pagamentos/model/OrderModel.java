package br.com.jcaguiar.pagamentos.model;

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

    @NonNull @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    ClientModel client;

    @NonNull @Column(nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    PlaceModel deliveryPlace;
}

package br.com.jcaguiar.pagamentos.model.order;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;

@Data
@NoArgsConstructor
//@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity(name = "order_item")
final public class OrderItemModel extends MasterModel {

    Double discount;

    @Column(nullable = false)
    Integer quantity;

    @Column(nullable = false)
    Double price;

}

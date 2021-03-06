package br.com.jcaguiar.pagamentos.model.category;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity(name = "category")
final public class CategoryModel extends MasterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String name;

}

package br.com.jcaguiar.pagamentos.repository;

import br.com.jcaguiar.pagamentos.model.category.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {

}

package br.com.jcaguiar.pagamentos.service;

import br.com.jcaguiar.pagamentos.model.category.CategoryModel;
import br.com.jcaguiar.pagamentos.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends MasterService<CategoryModel, Integer> {

    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}

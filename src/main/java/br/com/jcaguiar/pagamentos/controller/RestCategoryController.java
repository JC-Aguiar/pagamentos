package br.com.jcaguiar.pagamentos.controller;

import br.com.jcaguiar.pagamentos.model.category.CategoryDto;
import br.com.jcaguiar.pagamentos.model.category.CategoryModel;
import br.com.jcaguiar.pagamentos.service.CategoryService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("**/category")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RestCategoryController extends MasterController<Integer> {

    public RestCategoryController(CategoryService service) {
        super(service, CategoryModel.class, CategoryDto.class, CategoryDto.class);
    }
}

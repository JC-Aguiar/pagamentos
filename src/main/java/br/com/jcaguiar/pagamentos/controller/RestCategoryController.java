package br.com.jcaguiar.pagamentos.controller;

import br.com.jcaguiar.pagamentos.model.category.CategoryDto;
import br.com.jcaguiar.pagamentos.model.category.CategoryModel;
import br.com.jcaguiar.pagamentos.service.CategoryService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/category")
public class RestCategoryController extends MasterController<CategoryModel, Integer> {

    @Autowired
    CategoryService service;

    public RestCategoryController() {
        super(CategoryModel.class, CategoryDto.class, CategoryDto.class);
        super.service = this.service;
    }
}

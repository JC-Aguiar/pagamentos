package br.com.jcaguiar.pagamentos.service;

import br.com.jcaguiar.pagamentos.model.MasterModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class MasterService<OBJ extends MasterModel, ID> {

    final protected JpaRepository<OBJ, ID> repository;

    public List<OBJ> findAll() {
        return null;
    }

    public OBJ saveOne(@Valid OBJ objModel) {
        return null;
    }


    public OBJ upOne(@Valid OBJ objModel) {
        return null;
    }


    public void deletOne(@RequestParam ID id) {
//        HttpStatus status = HttpStatus.OK;
//        return new ResponseEntity<>(null, status);
    }

}

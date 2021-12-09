package br.com.jcaguiar.pagamentos.controller;

import br.com.jcaguiar.pagamentos.model.MasterDTO;
import br.com.jcaguiar.pagamentos.model.MasterModel;
import br.com.jcaguiar.pagamentos.service.MasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public abstract class MasterController<OBJ extends MasterModel, ID> {

    @Autowired
    protected MasterService<OBJ, ID> service;
    final protected Class<OBJ> modelEntity;
    final protected Class<? extends MasterDTO> requestDto;
    final protected Class<? extends MasterDTO> responseDto;

    @GetMapping
    public ResponseEntity<MasterDTO> findAll() {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }

    @PostMapping
    public ResponseEntity<MasterDTO> saveOne(@Valid MasterDTO post) {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }


    @PutMapping("id/{id}")
    public ResponseEntity<MasterDTO> upOne(@RequestParam(name = "id") ID id, @Valid MasterDTO post) {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }


    @DeleteMapping("id/{id}")
    public ResponseEntity<MasterDTO> deletOne(@RequestParam(name = "id") ID id) {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }



}

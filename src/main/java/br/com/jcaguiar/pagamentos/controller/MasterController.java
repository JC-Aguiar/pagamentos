package br.com.jcaguiar.pagamentos.controller;

import br.com.jcaguiar.pagamentos.model.MasterDTO;
import br.com.jcaguiar.pagamentos.model.MasterModel;
import br.com.jcaguiar.pagamentos.service.MasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MasterController<ID> {

    final protected MasterService service;
    final protected MasterModel modelEntity;
    final protected MasterDTO requestDto;
    final protected MasterDTO responseDto;

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


    @PutMapping("id/{?}")
    public ResponseEntity<MasterDTO> upOne(@RequestParam ID id, @Valid MasterDTO post) {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }


    @DeleteMapping("id/{?}")
    public ResponseEntity<MasterDTO> deletOne(@RequestParam ID id) {
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(null, status);
    }



}

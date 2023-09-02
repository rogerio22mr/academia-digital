package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }

    @GetMapping("matricula/{id}")
    public Matricula get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

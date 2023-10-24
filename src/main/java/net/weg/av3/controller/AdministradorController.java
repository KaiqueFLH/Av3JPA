package net.weg.av3.controller;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Administrador;
import net.weg.av3.service.AdministradorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/adm")
public class AdministradorController {

    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public Administrador buscarUm(@PathVariable Integer id){
        return administradorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Administrador> buscarTodos(){
        return administradorService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        administradorService.deletar(id);
    }

    @PostMapping
    public void criar(@RequestBody Administrador administrador){
        administradorService.criar(administrador);
    }

    @PutMapping
    public void editar(@RequestBody Administrador administradorEditado){
        administradorService.editar(administradorEditado);
    }

}

package net.weg.av3.controller;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Atendente;
import net.weg.av3.service.AtendenteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/atendente")
public class AtendenteController {

    private AtendenteService atendenteService;

    @GetMapping("/{id}")
    public Atendente buscarUm(@PathVariable Integer id){
        return atendenteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Atendente> buscarTodos(){
        return atendenteService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        atendenteService.deletar(id);
    }

    @PostMapping
    public void criar(@RequestBody Atendente atendente){
        atendenteService.criar(atendente);
    }

    @PutMapping
    public void editar(@RequestBody Atendente atendente){
        atendenteService.editar(atendente);
    }

}

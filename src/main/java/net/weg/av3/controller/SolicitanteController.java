package net.weg.av3.controller;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Atendente;
import net.weg.av3.model.Solicitante;
import net.weg.av3.service.AtendenteService;
import net.weg.av3.service.SolicitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/solicitante")
public class SolicitanteController {

    private SolicitanteService solicitanteService;

    @GetMapping("/{id}")
    public Solicitante buscarUm(@PathVariable Integer id){
        return solicitanteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Solicitante> buscarTodos(){
        return solicitanteService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        solicitanteService.deletar(id);
    }

    @PostMapping
    public void criar(@RequestBody Solicitante solicitante){
        solicitanteService.criar(solicitante);
    }

    @PutMapping
    public void editar(@RequestBody Solicitante solicitante){
        solicitanteService.editar(solicitante);
    }

}

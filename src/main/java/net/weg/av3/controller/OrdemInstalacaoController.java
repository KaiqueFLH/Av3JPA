package net.weg.av3.controller;


import lombok.AllArgsConstructor;
import net.weg.av3.model.Atendente;
import net.weg.av3.model.OrdemInstalacao;
import net.weg.av3.service.OrdemInstalacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/ordemInstalacao")
public class OrdemInstalacaoController {

    private OrdemInstalacaoService ordemInstalacaoService;

    @GetMapping("/{id}")
    public OrdemInstalacao buscarUm(@PathVariable Integer id){
        return ordemInstalacaoService.buscarUm(id);
    }

    @GetMapping
    public Collection<OrdemInstalacao> buscarTodos(){
        return ordemInstalacaoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        ordemInstalacaoService.deletar(id);
    }

    @PostMapping
    public void criar(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemInstalacaoService.criar(ordemInstalacao);
    }

    @PutMapping
    public void editar(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemInstalacaoService.editar(ordemInstalacao);
    }
}

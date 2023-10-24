package net.weg.av3.controller;

import lombok.AllArgsConstructor;
import net.weg.av3.model.OrdemInstalacao;
import net.weg.av3.model.OrdemManutencao;
import net.weg.av3.service.OrdemInstalacaoService;
import net.weg.av3.service.OrdemManutencaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/ordemManutencao")
public class OrdemManutencaoController {

    private OrdemManutencaoService ordemManutencaoService;

    @GetMapping("/{id}")
    public OrdemManutencao buscarUm(@PathVariable Integer id){
        return ordemManutencaoService.buscarUm(id);
    }

    @GetMapping
    public Collection<OrdemManutencao> buscarTodos(){
        return ordemManutencaoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        ordemManutencaoService.deletar(id);
    }

    @PostMapping
    public void criar(@RequestBody OrdemManutencao ordemManutencao){
        ordemManutencaoService.criar(ordemManutencao);
    }

    @PutMapping
    public void editar(@RequestBody OrdemManutencao ordemManutencao){
        ordemManutencaoService.editar(ordemManutencao);
    }

}

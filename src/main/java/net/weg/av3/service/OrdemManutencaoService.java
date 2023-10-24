package net.weg.av3.service;

import lombok.AllArgsConstructor;
import net.weg.av3.model.OrdemInstalacao;
import net.weg.av3.model.OrdemManutencao;
import net.weg.av3.repository.OrdemInstalacaoRepository;
import net.weg.av3.repository.OrdemManutencaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@AllArgsConstructor
@Service
public class OrdemManutencaoService {

    private OrdemManutencaoRepository ordemManutencaoRepository;

    public OrdemManutencao buscarUm(Integer id){
        return ordemManutencaoRepository.findById(id).get();
    }

    public Collection<OrdemManutencao> buscarTodos() {
        return ordemManutencaoRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        ordemManutencaoRepository.deleteById(id);
    }

    public void criar(@RequestBody OrdemManutencao ordemManutencao) {
        ordemManutencaoRepository.save(ordemManutencao);
    }

    public void editar(@RequestBody OrdemManutencao ordemManutencao) { ordemManutencaoRepository.save(ordemManutencao); }

}

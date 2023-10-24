package net.weg.av3.service;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Administrador;
import net.weg.av3.model.OrdemInstalacao;
import net.weg.av3.repository.AdministradorRepository;
import net.weg.av3.repository.OrdemInstalacaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@AllArgsConstructor
@Service
public class OrdemInstalacaoService {

    private OrdemInstalacaoRepository ordemInstalacaoRepository;

    public OrdemInstalacao buscarUm(Integer id){
        return ordemInstalacaoRepository.findById(id).get();
    }

    public Collection<OrdemInstalacao> buscarTodos() {
        return ordemInstalacaoRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        ordemInstalacaoRepository.deleteById(id);
    }

    public void criar(@RequestBody OrdemInstalacao ordemInstalacao) {
        ordemInstalacaoRepository.save(ordemInstalacao);
    }

    public void editar(@RequestBody OrdemInstalacao ordemInstalacao) { ordemInstalacaoRepository.save(ordemInstalacao); }

}

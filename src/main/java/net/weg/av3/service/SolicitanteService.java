package net.weg.av3.service;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Atendente;
import net.weg.av3.model.Solicitante;
import net.weg.av3.repository.AtendenteRepository;
import net.weg.av3.repository.SolicitanteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@AllArgsConstructor
@Service
public class SolicitanteService {

    private SolicitanteRepository solicitanteRepository;

    public Solicitante buscarUm(Integer id){
        return solicitanteRepository.findById(id).get();
    }

    public Collection<Solicitante> buscarTodos() {
        return solicitanteRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        solicitanteRepository.deleteById(id);
    }

    public void criar(@RequestBody Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }

    public void editar(@RequestBody Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }
}

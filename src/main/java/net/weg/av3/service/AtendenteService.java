package net.weg.av3.service;

import lombok.AllArgsConstructor;

import net.weg.av3.model.Atendente;
import net.weg.av3.repository.AtendenteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@AllArgsConstructor
@Service
public class AtendenteService {

    private AtendenteRepository atendenteRepository;

    public Atendente buscarUm(Integer id){
        return atendenteRepository.findById(id).get();
    }

    public Collection<Atendente> buscarTodos() {
        return atendenteRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        atendenteRepository.deleteById(id);
    }

    public void criar(@RequestBody Atendente atendente) {
        atendenteRepository.save(atendente);
    }

    public void editar(@RequestBody Atendente atendente) {
        atendenteRepository.save(atendente);
    }
}

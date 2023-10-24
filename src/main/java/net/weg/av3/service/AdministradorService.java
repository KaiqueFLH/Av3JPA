package net.weg.av3.service;

import lombok.AllArgsConstructor;
import net.weg.av3.model.Administrador;
import net.weg.av3.model.Usuario;
import net.weg.av3.repository.AdministradorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@AllArgsConstructor
@Service
public class AdministradorService {

    private AdministradorRepository administradorRepository;

    public Administrador buscarUm(Integer id){
        return administradorRepository.findById(id).get();
    }

    public Collection<Administrador> buscarTodos() {
        return administradorRepository.findAll();
    }

    public void deletar(@PathVariable Integer id) {
        administradorRepository.deleteById(id);
    }

    public void criar(@RequestBody Administrador administrador) {
        administradorRepository.save(administrador);
    }

    public void editar(@RequestBody Administrador administrador) {
        administradorRepository.save(administrador);
    }

}

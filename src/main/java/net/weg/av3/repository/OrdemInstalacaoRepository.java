package net.weg.av3.repository;

import net.weg.av3.model.OrdemInstalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemInstalacaoRepository extends JpaRepository<OrdemInstalacao,Integer> {
}

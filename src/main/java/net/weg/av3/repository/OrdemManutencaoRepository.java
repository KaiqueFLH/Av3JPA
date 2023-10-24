package net.weg.av3.repository;

import net.weg.av3.model.OrdemManutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemManutencaoRepository extends JpaRepository<OrdemManutencao,Integer> {
}

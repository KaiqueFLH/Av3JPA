package net.weg.av3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrdemManutencao extends OrdemServico{

    private String dataManutencao;
    @Column(nullable = false)
    private String equipamento;

}

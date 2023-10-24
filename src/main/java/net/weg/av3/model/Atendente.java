package net.weg.av3.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Atendente extends Usuario{

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<OrdemServico> ordens;
}

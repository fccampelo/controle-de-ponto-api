package controle.de.ponto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal toletancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}

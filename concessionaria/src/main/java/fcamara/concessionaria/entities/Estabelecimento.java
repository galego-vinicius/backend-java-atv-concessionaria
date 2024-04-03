package fcamara.concessionaria.entities;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estabelecimento {
    @Column(name = "id_estabelecimento")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estabelecimento")
    @SequenceGenerator(name = "seq_estabelecimento", sequenceName = "seq_estabelecimento", allocationSize = 1)
    private Integer idEstabelecimento;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "endereco")
    private String endereço;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "qnt_vagas_moto")
    private String qntVagasMoto;
    @Column(name = "qnt_vagas_carro")
    private String qntVagasCarro;
}

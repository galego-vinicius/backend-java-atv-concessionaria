package fcamara.concessionaria.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estabelecimento {
    private String Nome;
    private String CNPJ;
    private String Endereço;
    private String Telefone;
    private String QntVagasMoto;
    private String QntVagasCarro;
}

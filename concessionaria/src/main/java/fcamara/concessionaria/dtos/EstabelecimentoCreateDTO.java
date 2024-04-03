package fcamara.concessionaria.dtos;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstabelecimentoCreateDTO {
    @NonNull
    @Schema(description = "Nome", example = "Locadora Automotiva Bromo's ")
    private String nome;
    @NonNull
    @Schema(description = "CNPJ", example = "98251176000110")
    private String cnpj;
    @NonNull
    @Schema(description = "Endereco", example = "Rua trobogy")
    private String endereço;
    @NonNull
    @Schema(description = "Telefone", example = "719953285")
    private String telefone;
    @NonNull
    @Schema(description = "Quantidade de vagas de moto", example = "300")
    private String qntVagasMoto;
    @NonNull
    @Schema(description = "Quantidade de vagas de carro", example = "112")
    private String qntVagasCarro;
}

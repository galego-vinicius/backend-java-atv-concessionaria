package fcamara.concessionaria.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoCreateDTO {
    private String Marca;
    private String Modelo;
    private String Cor;
    private String Placa;
    private String Tipo;
}

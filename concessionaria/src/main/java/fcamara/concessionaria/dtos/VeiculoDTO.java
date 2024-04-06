package fcamara.concessionaria.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO {
    private String Marca;
    private String Modelo;
    private String Cor;
    private String Placa;
    private String Tipo;
}

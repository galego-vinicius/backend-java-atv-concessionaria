package fcamara.concessionaria.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import fcamara.concessionaria.dtos.VeiculoDTO;
import fcamara.concessionaria.repositories.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VeiculoService {
    private final VeiculoRepository veiculosRepository;
    private final ObjectMapper objectMapper;
    public List<VeiculoDTO> listarveiculo(){
        return veiculosRepository.findAll().stream().map(
                v -> objectMapper.convertValue(v, VeiculoDTO.class))
                .collect(Collectors.toList());
    }
}

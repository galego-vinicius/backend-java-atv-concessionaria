package fcamara.concessionaria.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import fcamara.concessionaria.dtos.EstabelecimentoCreateDTO;
import fcamara.concessionaria.dtos.EstabelecimentoDTO;
import fcamara.concessionaria.entities.Estabelecimento;
import fcamara.concessionaria.repositories.EstabelecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EstabelecimentoService {
    private final EstabelecimentoRepository estabelecimentoRepository;
    private final ObjectMapper objectMapper;

    public List<EstabelecimentoDTO> listarEstabelecimento(){
        return estabelecimentoRepository.findAll().stream().map(e ->
                objectMapper.convertValue(e, EstabelecimentoDTO.class)).collect(Collectors.toList());
    }

    public EstabelecimentoDTO criarEstabelecimento(EstabelecimentoCreateDTO estabelecimentoCreateDTO){
        return objectMapper.convertValue(estabelecimentoRepository.save(
                objectMapper.convertValue(estabelecimentoCreateDTO, Estabelecimento.class)
        ), EstabelecimentoDTO.class);
    }

    public EstabelecimentoDTO atualizarEstabelecimento(Integer idEstabelecimento, EstabelecimentoCreateDTO estabelecimentoCreateDTO){
        Estabelecimento estabelecimento = estabelecimentoRepository.findById(idEstabelecimento).orElseThrow(() -> new IllegalArgumentException("Estabelecimento não existe"));
        BeanUtils.copyProperties(estabelecimentoCreateDTO, estabelecimento);
        return objectMapper.convertValue(estabelecimentoRepository.save(estabelecimento), EstabelecimentoDTO.class);
    }

    public void deletarEstabelecimento(Integer idEstabelecimento){
        Estabelecimento estabelecimento = estabelecimentoRepository.findById(idEstabelecimento).orElseThrow(() -> new IllegalArgumentException("Estabelecimento não existe"));
        estabelecimentoRepository.delete(estabelecimento);
    }
}

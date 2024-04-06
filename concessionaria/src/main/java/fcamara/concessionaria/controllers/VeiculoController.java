package fcamara.concessionaria.controllers;
import com.sun.istack.NotNull;
import fcamara.concessionaria.dtos.EstabelecimentoCreateDTO;
import fcamara.concessionaria.dtos.EstabelecimentoDTO;
import fcamara.concessionaria.dtos.VeiculoDTO;
import fcamara.concessionaria.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/veiculo")
public class VeiculoController {
    private final VeiculoService veiculoService;

    @GetMapping()
    public ResponseEntity<List<VeiculoDTO>> listarVeiculo(){
        return new ResponseEntity<>(veiculoService.listarveiculo(), HttpStatus.OK);
    }

//    @PostMapping()
//    public ResponseEntity<EstabelecimentoDTO> criarEstabelecimento(@RequestBody @Valid EstabelecimentoCreateDTO estabelecimentoCreateDTO){
//        return new ResponseEntity<>(estabelecimentoService.criarEstabelecimento(estabelecimentoCreateDTO), HttpStatus.OK);
//    }
//
//    @PutMapping()
//    public ResponseEntity<EstabelecimentoDTO> atualizarEstabelecimento(@RequestBody @Valid EstabelecimentoCreateDTO estabelecimentoCreateDTO,
//                                                                       @PathVariable("idEstabelecimento") @NotNull Integer idEstabelecimento){
//        return new ResponseEntity<>(estabelecimentoService.atualizarEstabelecimento(idEstabelecimento, estabelecimentoCreateDTO), HttpStatus.OK);
//    }
//
//    @DeleteMapping()
//    public ResponseEntity<Void> DeletarEstabelecimento(Integer idEstabelecimento){
//        estabelecimentoService.deletarEstabelecimento(idEstabelecimento);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}

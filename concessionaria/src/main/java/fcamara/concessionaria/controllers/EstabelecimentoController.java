package fcamara.concessionaria.controllers;
import com.sun.istack.NotNull;
import fcamara.concessionaria.dtos.EstabelecimentoCreateDTO;
import fcamara.concessionaria.dtos.EstabelecimentoDTO;
import javax.validation.Valid;
import fcamara.concessionaria.services.EstabelecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {
    private final EstabelecimentoService estabelecimentoService;

    @GetMapping()
    public ResponseEntity<List<EstabelecimentoDTO>> listarEstabelecimento(){
        return new ResponseEntity<>(estabelecimentoService.listarEstabelecimento(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<EstabelecimentoDTO> criarEstabelecimento(@RequestBody @Valid EstabelecimentoCreateDTO estabelecimentoCreateDTO){
        return new ResponseEntity<>(estabelecimentoService.criarEstabelecimento(estabelecimentoCreateDTO), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<EstabelecimentoDTO> atualizarEstabelecimento(@RequestBody @Valid EstabelecimentoCreateDTO estabelecimentoCreateDTO,
                                                                       @PathVariable("idEstabelecimento") @NotNull Integer idEstabelecimento){
    return new ResponseEntity<>(estabelecimentoService.atualizarEstabelecimento(idEstabelecimento, estabelecimentoCreateDTO), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Void> DeletarEstabelecimento(Integer idEstabelecimento){
        estabelecimentoService.deletarEstabelecimento(idEstabelecimento);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

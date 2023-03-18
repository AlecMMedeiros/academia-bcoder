package bcoder.academia.controller;

import bcoder.academia.entity.AvaliacaoFisica;
import bcoder.academia.entity.form.AvaliacaoFisicaForm;
import bcoder.academia.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  private final AvaliacaoFisicaServiceImpl service;

  public AvaliacaoFisicaController ( AvaliacaoFisicaServiceImpl service ) {
    this.service = service;
  }

  @PostMapping
  public AvaliacaoFisica create( @RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}

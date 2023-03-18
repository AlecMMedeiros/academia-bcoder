package bcoder.academia.controller;

import bcoder.academia.entity.Matricula;
import bcoder.academia.entity.form.MatriculaForm;
import bcoder.academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  private final MatriculaServiceImpl service;

  public MatriculaController ( MatriculaServiceImpl service ) {
    this.service = service;
  }

  @PostMapping
  public Matricula create( @Valid @RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}


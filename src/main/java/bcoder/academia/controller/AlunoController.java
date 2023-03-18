package bcoder.academia.controller;

import bcoder.academia.entity.Aluno;
import bcoder.academia.entity.AvaliacaoFisica;
import bcoder.academia.entity.form.AlunoForm;
import bcoder.academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  private final AlunoServiceImpl service;

  public AlunoController ( AlunoServiceImpl service ) {
    this.service = service;
  }

  @PostMapping
  public Aluno create( @Valid @RequestBody AlunoForm form) {
    return service.create(form);
  }

  @GetMapping("/avaliacoes/{id}")
  public List< AvaliacaoFisica > getAllAvaliacaoFisicaId( @PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping
  public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNacimento){
    return service.getAll(dataDeNacimento);
  }


}

package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateForm {

  @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @Past(message = "Data '${validateValue}' e invalida.")
  private LocalDate dataDeNascimento;
}

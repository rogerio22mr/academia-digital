package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

  @Positive(message = "'${validateValue}' precisa ser positivo.")
  private Double peso;

  @Positive(message = "'${validateValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "'${validateValue}' precisa ser no minimo {value}.")
  private Double altura;
}

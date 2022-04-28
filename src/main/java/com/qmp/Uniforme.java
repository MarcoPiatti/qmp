package com.qmp;

import java.util.Objects;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = Objects.requireNonNull(prendaSuperior, "La prenda superior no puede ser nula");
    this.prendaInferior = Objects.requireNonNull(prendaInferior, "La prenda superior no puede ser nula");
    this.calzado = Objects.requireNonNull(calzado, "El calzado no puede ser nulo");
  }


}

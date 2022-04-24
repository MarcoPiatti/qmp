package com.qmp;

import java.awt.Color;
import java.util.Objects;
import java.util.Optional;

public class Prenda {
  TipoPrenda tipo;
  Tela tela;
  Color colorPrimario;
  Optional<Color> colorSecundario;

  public Prenda(TipoPrenda tipo, Tela tela, Color colorPrimario, Color colorSecundario) {
    this.tipo = Objects.requireNonNull(tipo, "El tipo de una prenda no puede ser nulo");
    this.tela = Objects.requireNonNull(tela, "La tela de una prenda no puede ser nula");
    this.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario de una prenda no puede ser nulo");
    this.colorSecundario = Optional.ofNullable(colorSecundario);
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

}

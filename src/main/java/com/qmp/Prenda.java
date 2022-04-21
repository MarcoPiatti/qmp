package com.qmp;

import java.awt.Color;
import java.util.Objects;
import java.util.Optional;

public class Prenda {
  TipoPrenda tipo;
  String material;
  Color colorPrimario;
  Optional<Color> colorSecundario;

  public Prenda(TipoPrenda tipo, String material, Color colorPrimario, Color colorSecundario) {
    this.tipo = Objects.requireNonNull(tipo, "El tipo de prenda no puede ser nulo");
    this.material = Objects.requireNonNull(material, "El material no puede ser nulo");
    this.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario no puede ser nulo");
    this.colorSecundario = Optional.ofNullable(colorSecundario);
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

}

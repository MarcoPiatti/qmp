package com.qmp;

import java.awt.Color;
import java.util.Objects;

public class Prenda {
  TipoPrenda tipo;
  String material;
  Color colorPrimario;
  Color colorSecundario;

  public Prenda(TipoPrenda tipo, String material, Color colorPrimario, Color colorSecundario) {
    this.tipo = Objects.requireNonNull(tipo, "El tipo de prenda no puede ser nulo");
    this.material = Objects.requireNonNull(material, "El material no puede ser nulo");
    this.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario no puede ser nulo");
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

}

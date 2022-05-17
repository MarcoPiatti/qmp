package com.qmp.prendas;

import java.awt.Color;
import java.util.Optional;

public class Prenda {
  TipoPrenda tipo;
  Material material;
  Trama trama;
  Color colorPrimario;
  Optional<Color> colorSecundario;

  protected Prenda(TipoPrenda tipo, Material material, Trama trama, Color colorPrimario, Optional<Color> colorSecundario) {
    this.tipo = tipo;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }
}

package com.qmp.prendas;

import java.awt.Color;
import java.util.Optional;

public class Prenda {
  TipoPrenda tipo;
  Tela tela;
  Color colorPrimario;
  Optional<Color> colorSecundario;

  protected Prenda(TipoPrenda tipo, Tela tela, Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = Optional.ofNullable(colorSecundario);
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

}

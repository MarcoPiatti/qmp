package com.qmp.prendas;

import java.awt.Color;
import java.util.Optional;

public class Prenda {
  TipoPrenda tipo;
  Tela tela;
  Color colorPrimario;
  Optional<Color> colorSecundario;

  protected Prenda(TipoPrenda tipo, Tela tela, Color colorPrimario, Optional<Color> colorSecundario) {
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return tipo.getCategoria();
  }

}

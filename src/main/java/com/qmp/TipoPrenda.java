package com.qmp;

import java.util.Objects;

public enum TipoPrenda {
  ZAPATO(CategoriaPrenda.CALZADO),
  CAMISA_MANGA_CORTA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR);

  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = Objects.requireNonNull(categoria, "La categoria de un TipoPrenda no puede ser nula");
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
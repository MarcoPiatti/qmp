package com.qmp.prendas;

import java.util.Objects;

public enum TipoPrenda {
  CHOMBA(CategoriaPrenda.SUPERIOR),
  CAMISA_MANGA_CORTA(CategoriaPrenda.SUPERIOR),
  CAMISA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR),
  ZAPATO(CategoriaPrenda.CALZADO),
  ZAPATILLA(CategoriaPrenda.CALZADO),;

  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = Objects.requireNonNull(categoria, "La categoria de un TipoPrenda no puede ser nula");
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
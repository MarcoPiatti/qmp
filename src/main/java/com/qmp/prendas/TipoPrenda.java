package com.qmp.prendas;

public enum TipoPrenda {
  CHOMBA(CategoriaPrenda.SUPERIOR),
  CAMISA_MANGA_CORTA(CategoriaPrenda.SUPERIOR),
  REMERA_MANGA_LARGA(CategoriaPrenda.SUPERIOR),
  CAMISA(CategoriaPrenda.SUPERIOR),
  PANTALON(CategoriaPrenda.INFERIOR),
  ZAPATO(CategoriaPrenda.CALZADO),
  ZAPATILLA(CategoriaPrenda.CALZADO);

  CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
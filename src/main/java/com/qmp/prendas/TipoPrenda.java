package com.qmp.prendas;

public enum TipoPrenda {
  CHOMBA(CategoriaPrenda.SUPERIOR, 50.0),
  CAMISA_MANGA_CORTA(CategoriaPrenda.SUPERIOR, 50.0),
  REMERA_MANGA_LARGA(CategoriaPrenda.SUPERIOR, 20.0),
  CAMISA(CategoriaPrenda.SUPERIOR, 50.0),
  PANTALON(CategoriaPrenda.INFERIOR, 50.0),
  ZAPATO(CategoriaPrenda.CALZADO, 50.0),
  ZAPATILLA(CategoriaPrenda.CALZADO, 50.0);

  CategoriaPrenda categoria;
  Double temperaturaMaxima;

  TipoPrenda(CategoriaPrenda categoria, Double temperatura) {
    this.categoria = categoria;
    this.temperaturaMaxima = temperatura;
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }

  public Double getTemperaturaMaxima() {
    return temperaturaMaxima;
  }
}
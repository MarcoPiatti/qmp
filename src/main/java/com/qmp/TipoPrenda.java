package com.qmp;

public class TipoPrenda {
  String nombre;
  CategoriaPrenda categoria;

  public TipoPrenda(String nombre, CategoriaPrenda categoria) {
    this.nombre = nombre;
    this.categoria = categoria;
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}

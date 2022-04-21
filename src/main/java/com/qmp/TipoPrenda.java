package com.qmp;

import java.util.Objects;

public class TipoPrenda {
  String nombre;
  CategoriaPrenda categoria;

  public TipoPrenda(String nombre, CategoriaPrenda categoria) {
    this.nombre = Objects.requireNonNull(nombre, "El nombre de un TipoPrenda no puede ser nulo");
    this.categoria = Objects.requireNonNull(categoria, "La categoria de un TipoPrenda no puede ser nula");
  } 

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}
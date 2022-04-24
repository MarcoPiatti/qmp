package com.qmp;

import java.util.Objects;

public class Tela {
  Material material;
  Trama trama;

  Tela(Material material, Trama trama) {
    this.material = Objects.requireNonNull(material, "El material de una prenda no puede ser nulo");
    this.trama = trama;
    if(trama == null) this.trama = Trama.LISA;
  } 

  public Trama getCategoria() {
    return trama;
  }
}

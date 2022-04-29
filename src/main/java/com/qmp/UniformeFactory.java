package com.qmp;

import com.qmp.prendas.Prenda;

abstract class UniformeFactory {
  
  public Uniforme crearUniforme(){
    return new Uniforme(prendaSuperior(), prendaInferior(), calzado());
  }

  public abstract Prenda prendaSuperior();
  public abstract Prenda prendaInferior();
  public abstract Prenda calzado();
}

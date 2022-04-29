package com.qmp;

import java.awt.Color;
import java.util.Objects;

import com.qmp.prendas.*;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = Objects.requireNonNull(prendaSuperior, "La prenda superior no puede ser nula");
    this.prendaInferior = Objects.requireNonNull(prendaInferior, "La prenda superior no puede ser nula");
    this.calzado = Objects.requireNonNull(calzado, "El calzado no puede ser nulo");
  }

  public static Uniforme uniformeSanJuan(){
    
    Prenda superior = PrendaBuilder
                          .agregarTipo(TipoPrenda.CHOMBA)
                          .agregarAtributos(Material.PIQUE, null, Color.GREEN, null)
                          .finalizarPrenda();
    
    Prenda inferior = PrendaBuilder
                          .agregarTipo(TipoPrenda.PANTALON)
                          .agregarAtributos(Material.ACETATO, null, Color.GRAY, null)
                          .finalizarPrenda();

    Prenda calzado = PrendaBuilder
                          .agregarTipo(TipoPrenda.ZAPATILLA)
                          .agregarAtributos(Material.CUERO, null, Color.WHITE, null)
                          .finalizarPrenda();
    
    return new Uniforme(superior, inferior, calzado);
  }
}

package com.qmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

public class PrendaTest {
  
  @Test
  public void unaPrendaNoDebeFaltarTipo(){
    assertThrows(NullPointerException.class, () -> prendaSinTipo());
  }

  @Test
  public void unaPrendaNoDebeFaltarMaterial(){
    assertThrows(NullPointerException.class, () -> prendaSinMaterial());
  }

  @Test
  public void unaPrendaNoDebeFaltarColorPrimario(){
    assertThrows(NullPointerException.class, () -> prendaSinColorPrimario());
  }

  @Test
  public void unaPrendaPuedeNoTenerColorSecundario(){
    assertFalse(prendaSinColorSecundario().colorSecundario.isPresent());
  }

  private Prenda prendaSinTipo() {
    return new Prenda(null, "algodon", Color.BLACK, Color.WHITE);
  }

  private Prenda prendaSinMaterial() {
    return new Prenda(unTipoPrendaCualquiera(), null, Color.BLACK, Color.WHITE);
  }

  private Prenda prendaSinColorPrimario() {
    return new Prenda(unTipoPrendaCualquiera(), "algodon", null, Color.WHITE);
  }

  private Prenda prendaSinColorSecundario() {
    return new Prenda(unTipoPrendaCualquiera(), "algodon", Color.BLACK, null);
  }

  private TipoPrenda unTipoPrendaCualquiera() {
    return TipoPrenda.PANTALON;
  }

}

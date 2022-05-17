package com.qmp.prendas;

import java.awt.Color;
import java.util.Optional;

public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;

  public void setTipo(TipoPrenda tipo) {
      this.tipo = tipo;
  }

  public void setMaterial(Material material) {
      this.material = material;
  }

  public void setTrama(Trama trama) {
      this.trama = trama;
  }

  public void setColorPrimario(Color colorPrimario) {
      this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
      this.colorSecundario = colorSecundario;
  }

  public Prenda build(){
    if(tipo == null) throw new NullPointerException("la prenda no tiene tipo");
    if(material == null) throw new NullPointerException("la prenda no tiene material");
    if(trama == null) trama = Trama.LISA;
    if(colorPrimario == null) throw new NullPointerException("la prenda no tiene color primario");
    return new Prenda(tipo, material, trama, colorPrimario, Optional.ofNullable(colorSecundario));
  }
}
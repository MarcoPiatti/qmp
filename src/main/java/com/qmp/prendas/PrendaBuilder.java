package com.qmp.prendas;

import java.awt.Color;
import java.util.Objects;
import java.util.Optional;

public class PrendaBuilder {

  private TipoPrenda tipo;
  private Material material;
  private Trama trama;
  private Color colorPrimario;
  private Color colorSecundario;

  private PrendaBuilder(){}

  public static PrendaSinTela tipo(TipoPrenda tipo) {
    PrendaBuilder borrador = new PrendaBuilder();
    borrador.tipo = Objects.requireNonNull(tipo, "El tipo de una prenda no puede ser nulo");
    return new PrendaBuilder.PrendaSinTela(borrador);
  }

  public static class PrendaSinTela {
    private PrendaBuilder borrador;
    
    private PrendaSinTela(PrendaBuilder borrador) {
      this.borrador = borrador;
    }
    
    public PrendaSinColor tela(Material material, Trama trama) {
      borrador.material = Objects.requireNonNull(material, "El material de una prenda no puede ser nulo");
      borrador.trama = trama;
      if(trama == null) borrador.trama = Trama.LISA;
      return new PrendaBuilder.PrendaSinColor(borrador);
    }
  }

  public static class PrendaSinColor {
    private PrendaBuilder borrador;

    private PrendaSinColor(PrendaBuilder borrador) {
      this.borrador = borrador;
    }

    public PrendaPreparada colores(Color colorPrimario, Color colorSecundario) {
      borrador.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario de una prenda no puede ser nulo");
      borrador.colorSecundario = colorSecundario;
      return new PrendaBuilder.PrendaPreparada(borrador);
    }
  }
  public static class PrendaPreparada {
    private PrendaBuilder borrador;

    private PrendaPreparada(PrendaBuilder borrador) {
      this.borrador = borrador;
    }

    public Prenda build() {
      Tela tela = new Tela(borrador.material, borrador.trama);
      Optional<Color> colorSecundario = Optional.ofNullable(borrador.colorSecundario);

      return new Prenda(borrador.tipo,
                        tela, 
                        borrador.colorPrimario, 
                        colorSecundario);
    }
  }
}
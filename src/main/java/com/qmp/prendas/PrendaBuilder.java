package com.qmp.prendas;

import java.awt.Color;
import java.util.Objects;

public class PrendaBuilder {

  private TipoPrenda tipo;
  private Tela tela;
  private Color colorPrimario;
  private Color colorSecundario;

  public static PrendaConTipo agregarTipo(TipoPrenda tipo) {
    PrendaBuilder borrador = new PrendaBuilder();
    borrador.tipo = Objects.requireNonNull(tipo, "El tipo de una prenda no puede ser nulo");
    return new PrendaBuilder.PrendaConTipo(borrador);
  }

  public static class PrendaConTipo {
    private PrendaBuilder prendaBorrador;
    
    private PrendaConTipo(PrendaBuilder prendaBorrador) {
      this.prendaBorrador = prendaBorrador;
    }

    public PrendaPreparada agregarAtributos(Material material, Trama trama, Color colorPrimario, Color colorSecundario){
      prendaBorrador.tela = new Tela(material, trama);
      prendaBorrador.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario de una prenda no puede ser nulo");
      prendaBorrador.colorSecundario = colorSecundario;
      return new PrendaBuilder.PrendaPreparada(prendaBorrador);
    }
  }

  public static class PrendaPreparada {
    private PrendaBuilder prendaBorrador;

    private PrendaPreparada(PrendaBuilder prendaBorrador) {
      this.prendaBorrador = prendaBorrador;
    }

    public Prenda finalizarPrenda() {
      return new Prenda(prendaBorrador.tipo,
                        prendaBorrador.tela, 
                        prendaBorrador.colorPrimario, 
                        prendaBorrador.colorSecundario);
    }
  }
}
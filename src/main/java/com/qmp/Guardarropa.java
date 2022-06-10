package com.qmp;

import java.util.List;

import com.qmp.prendas.Prenda;

public class Guardarropa {
  List<Prenda> prendas;
  
  public Guardarropa(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }
}

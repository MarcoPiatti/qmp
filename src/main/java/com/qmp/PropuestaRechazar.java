package com.qmp;

import com.qmp.prendas.Prenda;

public class PropuestaRechazar extends PropuestaModificacion {
  public PropuestaRechazar(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  public void ejecutar() {
    guardarropa.quitarPrenda(prenda);
  }

  public void revertir() {
    guardarropa.agregarPrenda(prenda);
  }
}

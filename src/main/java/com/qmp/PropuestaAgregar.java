package com.qmp;

import com.qmp.prendas.Prenda;

public class PropuestaAgregar extends PropuestaModificacion{

  public PropuestaAgregar(Prenda prenda, Guardarropa guardarropa) {
    super(prenda, guardarropa);
  }

  public void ejecutar() {
    guardarropa.agregarPrenda(prenda);
  }

  public void revertir() {
    guardarropa.quitarPrenda(prenda);
  }
}

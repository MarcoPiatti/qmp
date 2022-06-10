package com.qmp;

import com.qmp.prendas.Prenda;

public enum OperacionPropuesta {
  
  AGREGAR_PRENDA {
    public void ejecutar(Prenda prenda, Guardarropa guardarropa) {
      guardarropa.agregarPrenda(prenda);
    }

    public void revertir(Prenda prenda, Guardarropa guardarropa) {
      guardarropa.quitarPrenda(prenda);
    }
  },
  QUITAR_PRENDA {
    public void ejecutar(Prenda prenda, Guardarropa guardarropa) {
      guardarropa.quitarPrenda(prenda);
    }

    public void revertir(Prenda prenda, Guardarropa guardarropa) {
      guardarropa.agregarPrenda(prenda);
    }
  };
  
  public abstract void ejecutar(Prenda prenda, Guardarropa guardarropa);
  public abstract void revertir(Prenda prenda, Guardarropa guardarropa);
}
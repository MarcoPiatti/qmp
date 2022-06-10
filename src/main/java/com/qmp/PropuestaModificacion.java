package com.qmp;

import com.qmp.prendas.Prenda;

public abstract class PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  EstadoPropuesta estado;

  protected PropuestaModificacion(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  public abstract void ejecutar();
  public abstract void revertir();

  public void aceptar() {
    estado.aceptar(this);
  }

  public void rechazar() {
    estado.rechazar(this);
  }

  public void deshacer() {
    estado.deshacer(this);
  }
}

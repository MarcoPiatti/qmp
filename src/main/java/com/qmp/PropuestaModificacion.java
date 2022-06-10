package com.qmp;

import com.qmp.prendas.Prenda;

public class PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  OperacionPropuesta operacion;
  EstadoPropuesta estado;

  public PropuestaModificacion(Prenda prenda, Guardarropa guardarropa, OperacionPropuesta tipo) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
    this.operacion = tipo;
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  public void aceptar() {
    if (estado != EstadoPropuesta.PENDIENTE) return;
    operacion.ejecutar(prenda, guardarropa);
    estado = EstadoPropuesta.ACEPTADA;
  }

  public void rechazar() {
    if (estado != EstadoPropuesta.PENDIENTE) return;
    estado = EstadoPropuesta.RECHAZADA;
  }

  public void revertir() {
    if (estado == EstadoPropuesta.PENDIENTE) return;
    operacion.revertir(prenda, guardarropa);
    estado = EstadoPropuesta.PENDIENTE;
  }
}

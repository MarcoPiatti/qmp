package com.qmp;

public enum EstadoPropuesta {
  PENDIENTE{
    public void aceptar(PropuestaModificacion propuesta) {
      propuesta.ejecutar();
      propuesta.estado = EstadoPropuesta.ACEPTADA;
    }

    public void deshacer(PropuestaModificacion propuesta) {}

    public void rechazar(PropuestaModificacion propuesta) {
      propuesta.estado = EstadoPropuesta.RECHAZADA;
    }
  }, 
  ACEPTADA, 
  RECHAZADA;

  public void aceptar(PropuestaModificacion propuesta){}
  public void rechazar(PropuestaModificacion propuesta){}
  public void deshacer(PropuestaModificacion propuesta) {
    propuesta.revertir();
    propuesta.estado = EstadoPropuesta.PENDIENTE;
  }
}
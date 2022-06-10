package com.qmp;

import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas;
  List<PropuestaModificacion> propuestas;

  public Usuario(List<Guardarropa> guardarropas) {
    this.guardarropas = guardarropas;
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void agregarPropuesta(PropuestaModificacion propuesta) {
    propuestas.add(propuesta);
  }
}

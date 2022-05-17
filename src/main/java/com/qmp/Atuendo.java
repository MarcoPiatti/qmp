package com.qmp;

import java.util.List;

import com.qmp.prendas.Prenda;

public class Atuendo {
  List<Prenda> prendasSuperiores;
  List<Prenda> prendasInferiores;
  List<Prenda> prendasCalzado;
  List<Prenda> prendasAccesorios;
  
  Atuendo(List<Prenda> prendasSuperiores, List<Prenda> prendasInferiores, List<Prenda> prendasCalzado, List<Prenda> prendasAccesorios) {
    this.prendasSuperiores = prendasSuperiores;
    this.prendasInferiores = prendasInferiores;
    this.prendasCalzado = prendasCalzado;
    this.prendasAccesorios = prendasAccesorios;
  }
}

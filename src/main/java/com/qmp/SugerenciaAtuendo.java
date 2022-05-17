package com.qmp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qmp.clima.ClimaLocator;
import com.qmp.prendas.CategoriaPrenda;
import com.qmp.prendas.Prenda;

public class SugerenciaAtuendo {
  List<Prenda> prendas;
  
  public SugerenciaAtuendo(){
    prendas = new ArrayList<>();
  }

  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }

  private List<Prenda> prendasSegunCategoria(CategoriaPrenda categoria){
    return prendas.stream().filter(p -> p.getCategoria() == categoria).collect(Collectors.toList());
  }

  private Integer cantidadSegunCategoria(CategoriaPrenda categoria){
    return prendasSegunCategoria(categoria).size();
  }

  private void validarTemperatura(){
    Double temperaturaActual = ClimaLocator.instance().getFeed().temperaturaCelsius("Buenos Aires");
    if(prendas.stream().anyMatch(prenda -> prenda.getTemperaturaMaxima() > temperaturaActual))
      throw new AtuendoInvalidoException("Las prendas del atuendo no son aptas para la temperatura actual");
  }

  private void validarPrendasFaltantes(){
    if(cantidadSegunCategoria(CategoriaPrenda.CALZADO) == 0) 
      throw new AtuendoInvalidoException("Falta un calzado");
    if(cantidadSegunCategoria(CategoriaPrenda.SUPERIOR) == 0) 
      throw new AtuendoInvalidoException("Falta una prenda superior");
    if(cantidadSegunCategoria(CategoriaPrenda.INFERIOR) == 0)
      throw new AtuendoInvalidoException("Falta una prenda inferior");
    if(cantidadSegunCategoria(CategoriaPrenda.ACCESORIO) == 0)
      throw new AtuendoInvalidoException("Falta un accesorio");
  }

  private void validarSugerencia(){
    validarPrendasFaltantes();
    validarTemperatura();
  }

  public Atuendo sugerirAtuendo(){
    validarSugerencia();
    return new Atuendo(prendas);
  }
}

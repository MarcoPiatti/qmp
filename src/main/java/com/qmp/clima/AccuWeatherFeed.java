package com.qmp.clima;

import java.util.HashMap;

public class AccuWeatherFeed implements ClimaFeed {
  AccuWeatherAPI api;

  AccuWeatherFeed() {
    api = new AccuWeatherAPI();
  }

  private Double farenheitToCelsius(Double farenheit) {
    return (farenheit - 32) * 5 / 9;
  }

  public Double temperaturaCelsius(String ciudad) {
    HashMap<String, Object> temperatureInfo = (HashMap<String, Object>) api.getWeather(ciudad).get(0).get("Temperature");
    Double temperatureFarenheit = (Double) temperatureInfo.get("Value");
    return farenheitToCelsius(temperatureFarenheit);
  }
}

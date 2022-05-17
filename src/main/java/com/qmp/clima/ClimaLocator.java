package com.qmp.clima;

public class ClimaLocator {
  ClimaFeed provider;

  ClimaLocator() {
    provider = new AccuWeatherFeed();
  }

  public void setProvider(ClimaFeed provider) {
    this.provider = provider;
  }

  public ClimaFeed getProvider() {
    return provider;
  }
}
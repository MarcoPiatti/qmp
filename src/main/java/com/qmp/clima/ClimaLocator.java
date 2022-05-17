package com.qmp.clima;

public class ClimaLocator {
  
  static ClimaLocator instance = new ClimaLocator();
  
  ClimaFeed feed;

  private ClimaLocator() {
    feed = new AccuWeatherFeed();
  }

  public static ClimaLocator instance() {
    return instance;
  }

  public void setFeed(ClimaFeed feed) {
    this.feed = feed;
  }

  public ClimaFeed getFeed() {
    return feed;
  }
}
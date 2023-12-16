package com.edujlac.observer;

import com.edujlac.observer.observers.CurrentConditionsDisplay;
import com.edujlac.observer.observers.HeatIndexDisplay;
import com.edujlac.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println(weatherData.getObservers());
    }
}

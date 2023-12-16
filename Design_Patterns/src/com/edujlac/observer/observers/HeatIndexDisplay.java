package com.edujlac.observer.observers;

import com.edujlac.observer.subject.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private double heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    private void computeHeatIndex() {

        float T = temperature;
        float RH = humidity;

        this.heatIndex = 16.923 + 1.85212 * Math.pow(10, -1) * T + 5.37941 * RH - 0.100254 * T
        * RH + 9.41695 * Math.pow(10, -3) * Math.pow(T, 2) + 7.28898 * Math.pow(10, -3) * Math.pow(RH, 2) +
        3.45372 * Math.pow(10, -4) * Math.pow(T, 2) * RH - 8.14971;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        computeHeatIndex();
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}

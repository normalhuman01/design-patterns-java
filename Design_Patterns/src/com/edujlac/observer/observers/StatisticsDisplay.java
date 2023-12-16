package com.edujlac.observer.observers;

import com.edujlac.observer.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float temperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Weather Stats");
        System.out.println("Avg. temp: " + temperature);
        System.out.println("Min temp: " + (temperature - 12));
        System.out.println("Max. temp: " + (temperature + 16));
    }

}

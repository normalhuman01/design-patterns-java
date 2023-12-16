package com.edujlac.observer.observers;

import com.edujlac.observer.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {

        String m = "The weather today is: ";

        if (humidity > 60 && temperature < 30) {
            m += "rainy";
        } else if (humidity < 60 && temperature > 50){
            m += "sunny";
        } else if (temperature < 0 && pressure < 30) {
            m += "snowy";
        }

        System.out.println(m);
    }
}

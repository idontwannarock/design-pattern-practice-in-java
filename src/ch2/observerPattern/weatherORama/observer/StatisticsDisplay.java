package ch2.observerPattern.weatherORama.observer;

import ch2.observerPattern.weatherORama.subject.Subject;
import ch2.observerPattern.weatherORama.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sumTemperature = 0.0f;
    private int updateCount;
    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature / updateCount) + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemperature += temperature;
        if (temperature > maxTemperature) maxTemperature = temperature;
        if (temperature < minTemperature) minTemperature = temperature;
        updateCount++;
        display();
    }
}

package designPattern.ch2.observer.weatherORama;

import designPattern.ch2.observer.weatherORama.observer.CurrentConditionsDisplay;
import designPattern.ch2.observer.weatherORama.observer.ForecastDisplay;
import designPattern.ch2.observer.weatherORama.observer.StatisticsDisplay;
import designPattern.ch2.observer.weatherORama.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

import ch2.observerPattern.weatherORama.observer.CurrentConditionsDisplay;
import ch2.observerPattern.weatherORama.observer.ForecastDisplay;
import ch2.observerPattern.weatherORama.observer.StatisticsDisplay;
import ch2.observerPattern.weatherORama.subject.WeatherData;
import org.junit.Test;

public class Ch2WeatherStation {

    @Test
    public void main() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}

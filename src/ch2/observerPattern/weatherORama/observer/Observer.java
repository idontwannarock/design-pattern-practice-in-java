package ch2.observerPattern.weatherORama.observer;

public interface Observer {

    void update(float temp, float humidity, float pressure);
}

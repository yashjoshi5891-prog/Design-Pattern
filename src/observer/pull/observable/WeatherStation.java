package observer.pull.observable;

import observer.pull.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private final List<observer.pull.observer.WeatherObserver> observers;

    private float temperature;
    private float humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setWeatherReadings(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void getWeatherData() {
        System.out.println("Weather: ");
        System.out.println("Temperature:" + temperature);
        System.out.println("Humidity:" + humidity);
    }
}

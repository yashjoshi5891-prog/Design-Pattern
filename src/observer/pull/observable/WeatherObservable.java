package observer.pull.observable;


import observer.data.WeatherData;
import observer.pull.observer.WeatherObserver;

public interface WeatherObservable {
    WeatherData weatherData = null;
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
    void setWeatherReadings(float temperature, float humidity);
    void getWeatherData();
}

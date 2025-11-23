package observer.push.observer;

import observer.data.WeatherData;

public interface WeatherObserver {
    void update(WeatherData weatherData);
}

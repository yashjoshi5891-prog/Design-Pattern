package observer.pull.observer;

import observer.pull.observable.WeatherObservable;

public class CurrentConditionDisplay implements WeatherObserver {
    private final WeatherObservable weatherStation;

    public CurrentConditionDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Current Condition -");
        weatherStation.getWeatherData();
    }
}

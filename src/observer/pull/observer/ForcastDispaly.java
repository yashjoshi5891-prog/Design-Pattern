package observer.pull.observer;

import observer.pull.observable.WeatherObservable;

public class ForcastDispaly implements WeatherObserver {
    private final WeatherObservable weatherStation;

    public ForcastDispaly(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {

    }
}

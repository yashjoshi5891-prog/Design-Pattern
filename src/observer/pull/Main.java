package observer.pull;

import observer.pull.observer.CurrentConditionDisplay;
import observer.pull.observable.WeatherObservable;
import observer.pull.observable.WeatherStation;
import observer.pull.observer.ForcastDispaly;

public class Main {
    public static void main(String[] args) {
        WeatherObservable weatherStation = new WeatherStation();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherStation);
        ForcastDispaly forcastDispaly = new ForcastDispaly(weatherStation);

        weatherStation.setWeatherReadings(30.4f, 25f);

        weatherStation.removeObserver(forcastDispaly);
    }
}

package observer.push;

import observer.push.observable.WeatherObservable;
import observer.push.observable.WeatherStation;
import observer.push.observer.CurrentConditionDisplay;
import observer.push.observer.ForcastDispaly;

public class Main {
    public static void main(String[] args) {
        WeatherObservable weatherStation = new WeatherStation();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        ForcastDispaly forcastDispaly = new ForcastDispaly();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forcastDispaly);

        weatherStation.setWeatherReadings(30.4f, 65f);

        weatherStation.removeObserver(forcastDispaly);
    }
}

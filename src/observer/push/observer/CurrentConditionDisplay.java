package observer.push.observer;

import observer.data.WeatherData;

public class CurrentConditionDisplay implements WeatherObserver{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current Condition -");
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Humidity: " + weatherData.getHumidity());
    }
}

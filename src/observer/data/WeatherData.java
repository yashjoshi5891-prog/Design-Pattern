package observer.data;

public class WeatherData {

    private float temperature;
    private  float humidity;

    public WeatherData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}

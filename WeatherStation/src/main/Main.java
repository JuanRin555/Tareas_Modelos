
package main;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherStation);

        PressureDisplay pressureDisplay =
                new PressureDisplay(weatherStation);

        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherStation);

        weatherStation.setMeasurements(30.0f, 70.0f, 1013.0f);

        weatherStation.setMeasurements(35.0f, 80.0f, 1008.0f);
    }
}

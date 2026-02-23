
package main;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions:");
        System.out.println("Temperature: " + temperature + " C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println();
    }
}

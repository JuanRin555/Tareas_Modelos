
package main;

public class PressureDisplay implements Observer, DisplayElement {

    private float pressure;

    public PressureDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Pressure Display:");
        System.out.println("Atmospheric Pressure: " + pressure + " hPa");
        System.out.println();
    }
}

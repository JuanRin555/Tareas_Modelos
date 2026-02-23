
package main;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float heatIndex;

    public HeatIndexDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.heatIndex = calculateHeatIndex(temperature, humidity);
        display();
    }

    private float calculateHeatIndex(float T, float R) {

        double c1 = -8.78469475556;
        double c2 = 1.61139411;
        double c3 = 2.33854883889;
        double c4 = -0.14611605;
        double c5 = -0.012308094;
        double c6 = -0.0164248277778;
        double c7 = 0.002211732;
        double c8 = 0.00072546;
        double c9 = -0.000003582;

        return (float) (
                c1
                        + (c2 * T)
                        + (c3 * R)
                        + (c4 * T * R)
                        + (c5 * T * T)
                        + (c6 * R * R)
                        + (c7 * T * T * R)
                        + (c8 * T * R * R)
                        + (c9 * T * T * R * R)
        );
    }

    @Override
    public void display() {
        System.out.println("Heat Index Display:");
        System.out.println("Heat Index: " + heatIndex + " C");
        System.out.println();
    }
}

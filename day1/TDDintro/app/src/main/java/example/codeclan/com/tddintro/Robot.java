package example.codeclan.com.tddintro;

/**
 * Created by user on 17/04/2017.
 */

public class Robot {
    private String name;
    private String colour;
    private double battery;

    public Robot(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.battery = 100.0;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double getBattery() {
        return battery;
    }

    public String makeDrink(String drink) {
        battery -= 10;
        return "Making " + drink;
    }

    public String washDishes() {
        battery -= 30;
        return "Washing the dishes";
    }

    public String doDusting() {
        battery -= 20;
        return "Doing the dusting";
    }

    public void Recharge() {
        this.battery = 100.;
    }
}

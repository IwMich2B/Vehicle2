package pl.accenture;

import org.w3c.dom.ls.LSOutput;

public class Car extends Vehicle{


    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        System.out.println("Z klasy Car");
        return 80.0;
    }

    @Override
    public double getDistance() {
        System.out.println("Z klasy Car");
        return 90.0;
    }
}

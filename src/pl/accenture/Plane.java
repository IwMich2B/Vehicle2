package pl.accenture;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public double getFuelNeeds() {
        return 400.00;
    }

    @Override
    public double getDistance() {
        return 3000.0;
    }



    @Override
    public void go() {
        takeOff();

    }

    @Override
    public void stop() {
        land();

    }

    @Override
    public void takeOff() {
        System.out.println("start o 12:00");

    }

    @Override
    public void land() {
        System.out.println(" Wylondował 19:00 ");

    }

    @Override
    public void callAirControl() {


    }
}

package pl.accenture;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        System.out.println("Wartosc z klasy Truck");
        return 100.0;
    }
}

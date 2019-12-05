package pl.accenture;

public class RaceCar extends Car {
    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        System.out.println("Wartosc z klasy Truck");
        return 280.3;
    }
}

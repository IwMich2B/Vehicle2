package pl.accenture;

public class Ship extends Vehicle implements Sailing {
    public Ship(String name) {
        super(name);
    }



    @Override
    public double getFuelNeeds() {
        System.out.println("Wartosc z klasy Ship");
        return 33.0;
    }

    @Override
    public double getDistance() {
        System.out.println("Wartosc z klasy Ship");
        return 55.8;
    }

    @Override
    public double calculateFuelConsumption() {
        return 0;
    }

    @Override
    public void go() {


    }

    @Override
    public void stop() {
        System.out.println("Jestem metodą stop z klasy Ship");
        dock();


    }

    @Override
    public void dock() {
        System.out.println("Przybyłem do portu");


    }
}

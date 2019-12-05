package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("car"), new Plane("plain"), new Ship("ship"), new RaceCar("porsze"), new Truck("dostawczy")};
        for (Vehicle ve : vehicles) {
            if (ve instanceof Car) {
                ve.getFuelNeeds();
                ve.getDistance();
            }if(ve instanceof Plane){
                ve.getDistance();
                ve.getFuelNeeds();
                ((Plane) ve).takeOff();
                ((Plane) ve).land();
                ((Plane) ve).callAirControl();
                ve.stop();
                ve.go();
            }if(ve instanceof Ship){
                ve.getFuelNeeds();
                ve.getDistance();
                ve.go();
                ve.stop();
            }if(ve instanceof RaceCar){
                ve.getFuelNeeds();
            }if(ve instanceof Truck){
                ve.getFuelNeeds();
            }

        }
    }
}

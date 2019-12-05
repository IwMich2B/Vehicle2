package pl.accenture;

abstract class Vehicle {
    private String name;



    public Vehicle(String name) {
        this.name = name;
    }
   public  String toString(){
        return name;
   };
  public  abstract double getFuelNeeds();
  public abstract double getDistance();
  public  double calculateFuelConsumption(){
      System.out.println("Zwracana wartosc z klasy Vehicle");
      return 45.9;
  };
  public void go(){
      System.out.println("Wystartował pojazd " + getClass().getName());

  };
  public void stop(){
      System.out.println("Zatrzymał się  pojazd " + getClass().getName());
  };




}

public class Appliances {

    String brand;
    int powerConsumption;
    Boolean itsTurnedOn = true;

        //Constructor
    public Appliances (String brand, int powerConsumption){
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        itsTurnedOn = true;
    }
    public void turnOn(){
        itsTurnedOn = true;
        System.out.println(brand + "appliance is turned ON");
    }
    public void turnOff(){
        itsTurnedOn = false;
        System.out.println(brand + "appliance is turned OFF");
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Power consumption: " + powerConsumption);
        System.out.println("Is switched on: " + itsTurnedOn);
    }



}

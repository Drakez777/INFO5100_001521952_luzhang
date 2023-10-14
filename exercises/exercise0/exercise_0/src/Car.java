public class Car {
    String make;
    String model;
    int year;
    String color;
    String license_plate;
    String fuel_type;
    int mileage;
    int max_speed;
    String uniqueName;

    Car(String make, String model, int year, String color,String license_plate,String fuel_type,int mileage,int max_speed,String uniqueName){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.license_plate = license_plate;
        this.fuel_type = fuel_type;
        this.mileage = mileage;
        this.max_speed = max_speed;
        System.out.println("House " + uniqueName + " created.");
    }

    public void load(){}
    public void brake(){}
    public void drive(){}



}

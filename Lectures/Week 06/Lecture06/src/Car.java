public class Car {
    //Fields
    private String make = "";
    private String model = "";
    private int year = 0;

    //Default constructor
    public Car() {
        this.make = "Lexus";
        this.model = "LFA";
        this.year = 2010;
    }

    //Overloaded constructor (When the constructor takes parameters)
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void start() {
        System.out.println("Started the " + this.make + " " + this.model);
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void drive(int speed) {
        System.out.println("Car driving at " + speed);
    }
}


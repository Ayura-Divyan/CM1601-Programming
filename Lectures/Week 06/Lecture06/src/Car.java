public class Car {
    //Fields
    private String make = "";
    private String model = "";
    private int year = 0;

    public String getMake(){
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
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


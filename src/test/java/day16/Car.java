package day16;

public class Car {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getWheels() {
        return wheels;
    }

    public static void setWheels(int wheels) {
        Car.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    private  String type="vehicle";
    public static int wheels=4;
    public String color="blue";
    String fuel="petrol";

    protected void seat()
    {
        int seat=4;
        System.out.println("Car seat="+seat);
    }
}

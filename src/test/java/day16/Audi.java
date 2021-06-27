package day16;
//Audi is child class of car class
public class Audi extends Car
{
    //Audi is child class of car class
    public int speed=100;

    public static void main(String[] args) {
        Audi a=new Audi();
        a.printdetails();
        System.out.println("Color of Audi="+a.color);
        System.out.println("fuel of Audi="+a.getFuel());
    }
    public void printdetails()
    {
        System.out.println("Wheels of Audi"+wheels);
        System.out.println("speed of audi"+speed);
        seat();
      //  System.out.println("wheels of audi"+type);
    }

}

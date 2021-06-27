package day16;

public class Ford extends Car{
    public static void main(String[] args) {
        Car c=new Ford();
        c.seat();
    }

    /**
     *   Overriding method using parent class(Car) and seat()
     */
    protected void seat()
    {
        int seat=6;
        System.out.println("car seat"+ seat);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car a = new Car();
        a.display();
        a.setBrand();
        a.display();
    }
}

class Car
{
    String brand;
    Car()
    {
        brand="unknown";
    }
    String setBrand()
    {
        brand="TATA";
        return brand;
    }
    void display()
    {
        System.out.println("The Barnd is : "+brand);
    }
}


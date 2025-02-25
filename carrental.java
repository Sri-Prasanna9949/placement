import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int carID;
        String cartype;
        float rent;
        CarRental a = new CarRental();
        carID = a.getCarid();
        cartype = a.getCartype();
        rent = a.getRent(cartype);
        System.out.print(rent);
        a.showCar();
    }
}

class CarRental {
    int carID;
    String cartype;
    float rent;
    public int getCarid() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the car ID: ");
        return in.nextInt();
    }

    public String getCartype() {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the car type: ");
        in.nextLine(); 
        return in.nextLine();
    }

    public float getRent(String carType) {
        float rent = 0;
        if (carType.equalsIgnoreCase("Small car")) {
            rent = 1000;
        } else if (carType.equalsIgnoreCase("Van")) {
            rent = 800;
        } else if (carType.equalsIgnoreCase("SUV")) {
            rent = 2500;
        }
        return rent;
    }

    public void showCar() {
        System.out.println("Car ID: " + carID);
        System.out.println("Car Type: " + cartype);
        System.out.println("Rent: " + rent);
    }
}

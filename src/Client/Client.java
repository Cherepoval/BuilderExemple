package Client;

import builders.CarBuilder;
import builders.ManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;
import java.util.Scanner;

public class Client {
    public static void main (String[] args){
        System.out.println("Insert type of car: ");
        Scanner sc = new Scanner(System.in);
        String carType = sc.nextLine();
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manual = new ManualBuilder();

        if (carType.toLowerCase().contains("city")){
            director.constructCityCar(builder);
            director.constructCityCar(manual);
        } else if (carType.toLowerCase().contains("sport")){
            director.constructSportsCar(builder);
            director.constructSportsCar(manual);
        } else if (carType.toLowerCase().contains("suv")){
            director.constructSUV(builder);
            director.constructSUV(manual);
        } else {
            System.err.println("This type not support");
        }

        Car car = builder.getResult();
        System.out.println("\n Car built:\n" + car.getCarType());

        Manual carManual = manual.getResult();
        System.out.println("\n Car Manual built: \n" + carManual.print());
    }
}

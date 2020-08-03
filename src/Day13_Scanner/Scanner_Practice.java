package Day13_Scanner;
/*
1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars

 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your car brand: ");
        String brand= scan.nextLine();

        System.out.println("Enter your car model: ");
        String model= scan.nextLine();

        System.out.println("Enter your car year: ");
        String carYear=scan.nextLine();

        System.out.println("Enter your car color: ");
        String carColor=scan.nextLine();

        System.out.println("Enter your car mileage: ");
        String carMileage=scan.nextLine();

        System.out.println("Enter car price: ");
        String carPrice=scan.nextLine();

        System.out.println(carYear+" "+brand+" "+model+" "+carColor+", "+carMileage+" miles, "+carPrice+" dollars");
        scan.close();









    }
}

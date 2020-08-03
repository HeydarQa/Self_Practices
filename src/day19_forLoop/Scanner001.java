package day19_forLoop;

import java.util.Scanner;

public class Scanner001 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        int seniorCitizens=input.nextInt();
        int nonseniorCitizens=input.nextInt();

        System.out.println("What is new citizen's age?");
        int age=input.nextInt();

        String seniorOrNonSenior=(age>=65? "Senior Citizen":"Non-Senior Citizen");
        System.out.println(seniorOrNonSenior);

        int seniorCitizesCount=(age>=65? seniorCitizens+1:seniorCitizens);
        int nonseniorCitizesCount=(age<65? nonseniorCitizens+1:nonseniorCitizens);
        System.out.println("New seniorCitizens count "+seniorCitizesCount);
        System.out.println("New nonSeniorCitizens count "+nonseniorCitizesCount);

    }

}

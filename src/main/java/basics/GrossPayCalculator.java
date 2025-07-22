package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("How many hours did you work?");
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;
        System.out.println("Gross pay: " + payRate);
    }
}

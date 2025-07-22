package decision_structure;

import static basics.GrossPayCalculator.scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        double salary = 1000;
        double bonus = 200;
        int quota = 10;

        System.out.println("How many sales did the employee get his week?");

        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            salary = salary + bonus;
        }

        System.out.println("Salary: " + salary);
    }
}

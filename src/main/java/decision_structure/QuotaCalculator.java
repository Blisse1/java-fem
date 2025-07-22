package decision_structure;

import static basics.GrossPayCalculator.scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the number of sales made:");
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota)
            System.out.println("Congratulations!");
        else{
            int salesShort = quota - sales;
            System.out.println("You didn't meet the expectation quota by " + salesShort + " sales");
        }
    }
}

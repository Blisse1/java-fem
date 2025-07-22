package decision_structure;

import static basics.GrossPayCalculator.scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        String grade = scanner.next();
        scanner.close();

        // enhanced switch
        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great Job";
            case "C" -> "Good try";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        // enhanced switch with two cases
//        String message = switch (grade) {
//            case "A", "B" -> "Excellent job!";
//            case "B" -> "Great Job";
//            case "C" -> {
    //        yield "Good try"; // for muliple statements
//            }
//            case "D" -> "You need to work a bit harder";
//            case "F" -> "Uh oh!";
//            default -> "Error. Invalid grade";
//        };


        System.out.println(message);
    }
}

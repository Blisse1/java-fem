package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
//        try{
//           file.createNewFile();
//        }catch (IOException e){
//            System.out.println("An error occurred: " + e.getMessage());
//        }
        try{
           file.createNewFile();
        }catch (Exception e){  // catch all kinds of exceptions that can occur
            // that is polymorphism
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

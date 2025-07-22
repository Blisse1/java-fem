package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6; // declaration of a constant
    private static final int MAX_TICKET_NUMBER = 69; // declaration of a constant

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i<LENGTH; i++){
            int randomNumber;

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER);
            } while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearch){
        for(int value : array){
            return value == numberToSearch;
        }
        return false;
    }

    public static void printTicket(int[] array){
        Arrays.sort(array);
        for(int number : array){
            System.out.print(number + " | ");
        }
    }
}

package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle room1 = getRoom();
        Rectangle room2 = getRoom();
        double totalArea = calculateAreaOfRoom(room1, room2);
        System.out.println("Area of both rooms: " + totalArea);
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public static <Char> double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return (room1.calculateArea() * room2.calculateArea());
    }
}

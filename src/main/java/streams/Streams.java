package streams;

import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        myStreamMethod();
    }

    public static void myStreamMethod(){
        int[] numbers = {0, 2, 4, 6};

        Arrays.stream(numbers).parallel()
                .forEach(number -> System.out.println(number + 1));
    }
}

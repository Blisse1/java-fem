package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    static List<String> veggies = List.of(
            "spinach",
            "cabbage",
            "peas",
            "creen beans"
    );

    public static void main(String[] args) {
//        anyMatchDemo();
//        allMatchesDemo();
//        filterDemo();
//        mapDemo();
//        reduceDemo();
//        intReduceDemo();
//        collectDemo();
        multiOperationDemo();
    }

    public static void anyMatchDemo(){
        boolean anyMatches = veggies.stream().anyMatch(vegetable -> vegetable.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchesDemo(){
        boolean allMatches = veggies.stream().allMatch(vegetable -> vegetable.contains("s"));
        System.out.println(allMatches);
    }

    public static void filterDemo(){
        veggies.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);
    }

    public static void mapDemo(){
        veggies.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void reduceDemo(){
        System.out.println(veggies.stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b));
    }

    public static void intReduceDemo(){
        List<Integer> number = List.of(2, 3, 4, 5);
        var sum = number.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void collectDemo(){
        List veggiesList = veggies.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());

        veggiesList.forEach(System.out::println);
    }

    public static void multiOperationDemo(){
        veggies.stream()
                .sorted()
                .filter(v -> v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v -> v.transform(w -> "yummy " + w))
                .forEach(System.out::println);
    }
}

package data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set fruits = new HashSet(); // same type of objects
        // set is unordered
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();

        while(i.hasNext()){ // hasNext says like are there any more elements in the array?
            System.out.println(i.next());
        }
//
//        System.out.println(fruits);
//        fruits.remove("lemon");
//        System.out.println("contains lemon? " + fruits.contains("lemon"));
//
//        System.out.println("size " + fruits.size());
//
//        Set moreFruits = Set.of("pear", "raisin", "cherry"); // add directly objects to the collection
        // this set would be immutable, you cannot change it
//        moreFruits.add("cranberry");
    }

    public static void listDemo(){
        List<String> fruits = new ArrayList(); // list is an interface
        // its best practice to be specific on the type of objects that
        // your collection can hold
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");

        fruits.set(1, "grape");
        fruits.add("lemon");
//        fruits.remove("lemon"); // removes first found
//        fruits.remove(3);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

//        System.out.println("index 2 " + fruits.get(2));
//        System.out.println(fruits.indexOf("grape"));
//        System.out.println(fruits.lastIndexOf("lemon"));
//
//        List moreFruits = List.of("cherry", "plum"); // immutable
    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");

        System.out.println(fruits);

        var removed = fruits.remove(); // itll remove the head from the queue
        // and store it right here

        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());
        System.out.println(fruits);
    }

    public static void mapDemo(){
        Map<String, Integer> fruitsCalories = new HashMap(); // hashmap is not ordered
        fruitsCalories.put("apple", 95); // 95 is an object, and integer, not an int
        fruitsCalories.put("lemon", 20);
        fruitsCalories.put("banana", 105);
        fruitsCalories.put("orange", 45);
        fruitsCalories.putIfAbsent("orange", 45); // it'll check first
        fruitsCalories.remove("lemon");

        // Enhanced loop in a Map
        for(Map.Entry calorieInfo: fruitsCalories.entrySet()){
            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
        }

//        System.out.println(fruitsCalories);
//        System.out.println("banana calories: " + fruitsCalories.get("banana"));
//
//        System.out.println("contains orange? " + fruitsCalories.containsKey("orange"));
//
//        Map immutableFruitCalories = Map.of(
//                "apple", 95,
//                "lemon", 20
//        );
    }
}

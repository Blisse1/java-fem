package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Cat();
//        sasha.makeSound();
//        sasha = new Cat();
//        sasha.makeSound();
        feed(sasha);
    }

    // it can take Animal or any subclass of Animal
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
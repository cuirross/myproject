package lesson10;

public class Main {
    public static void main(String[] args) {
Cat cat1 = new Cat("Барсик");
Cat cat2 = new Cat("Киси мяу");
Dog dog1 = new Dog("Барон");
cat1.run(200);
cat1.run(201);
cat1.swim(10);
dog1.run(500);
dog1.run(501);
dog1.swim(10);
dog1.swim(11);
        System.out.println(Animal.getAnimalCounter());
        System.out.println(Cat.getCatCounter());
        System.out.println(Dog.getDogCounter());
    }
}

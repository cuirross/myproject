package lesson10;

public class Cat extends Animal {
    private final String name;
    private static int catCounter;


    public Cat(String name) {
        this.name = name;
        catCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance);
        } else {
            System.out.println("Слишком много для кота");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
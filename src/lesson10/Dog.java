package lesson10;

public class Dog extends Animal {
private final String name;
private static int dogCounter;

    public Dog(String name) {
        this.name = name;
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance<=500){
            System.out.println(name + " пробежал " + distance);
        }else {
            System.out.println("Собака не может пробежать больше");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance<=10){
            System.out.println(name + " проплыл " + distance);
        }else {
            System.out.println("Собака не может проплыть больше");
        }

    }

    public static int getDogCounter() {
        return dogCounter;
    }
}

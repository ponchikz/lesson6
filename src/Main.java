public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("����");
        Dog dog = new Dog("����");

        cat.run(200);
        cat.swim(5);

        dog.run(250);
        dog.swim(3);
    }
}

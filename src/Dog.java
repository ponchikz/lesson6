public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int obstacles) {
        if (obstacles < 500) {
            System.out.println("Собака пробежала");
        } else {
            System.out.println("Собака не пробежал");
        }
    }
    @Override
    public void swim(int obstacles) {
        if (obstacles < 10) {
            System.out.println("Собака проплыла");
        } else {
            System.out.println("Собака не проплыла");
        }
    }
}

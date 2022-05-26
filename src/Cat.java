public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int obstacles){
        if (obstacles < 200) {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }

    }
    @Override
    public void swim(int obstacles) {
        System.out.println("Кот не умеет плавать");

    }
}

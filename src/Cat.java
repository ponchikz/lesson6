public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int obstacles){
        if (obstacles < 200) {
            System.out.println("��� ��������");
        } else {
            System.out.println("��� �� ��������");
        }

    }
    @Override
    public void swim(int obstacles) {
        System.out.println("��� �� ����� �������");

    }
}

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int obstacles) {
        if (obstacles < 500) {
            System.out.println("������ ���������");
        } else {
            System.out.println("������ �� ��������");
        }
    }
    @Override
    public void swim(int obstacles) {
        if (obstacles < 10) {
            System.out.println("������ ��������");
        } else {
            System.out.println("������ �� ��������");
        }
    }
}

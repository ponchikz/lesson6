abstract public class Animals {

    public String name;

    public Animals(String name) {
        this.name = name;
    }

    abstract public void run(int obstacles);

    abstract public void swim(int obstacles);

}

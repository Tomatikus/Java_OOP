public class Pengyin extends Watterswim implements Runable, Flyable{
    private int wingSize;

    public Pengyin(String name, int weight, int age, int wingSize) {
        super(name, weight, age);
        this.wingSize = wingSize;
    }

    public int getWingSize() {
        return wingSize;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", size of wings: %d", wingSize);
    }

    @Override
    public String say() {
        return "Clacking";
    }

    @Override
    public int speedRun() {
        return 4;
    }

    @Override
    public int speedFly() {
        return 0;
    }
}

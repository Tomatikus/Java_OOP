public class Turtel extends Watterswim implements Runable {
    private int armor; // уровень брони

    public Turtel(String name, int weight, int age, int armor) {
        super(name, weight, age);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {

        return super.toString() + String.format(", armor: %d", armor);
    }

    @Override
    public String say() {
        return "shshshshsh";
    }

    @Override
    public int speedRun() {
        return 15;
    }

}

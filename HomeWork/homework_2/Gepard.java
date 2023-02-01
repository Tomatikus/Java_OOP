public class Gepard extends Watterswim implements Runable{
    private int fangs;           

    public Gepard(String name, int weight, int age, int fangs) {
        super(name, weight, age);
        this.fangs = fangs;
    }

    public int getFangs() {
        return fangs;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", fangs: %d ", fangs);
    }

    @Override
    public String say() {
        return "Roar-roar";
    }

    @Override
    public int speedRun() {
        return 100;
    }
}

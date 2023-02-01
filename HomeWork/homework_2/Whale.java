public class Whale extends Watterswim implements Swimable {
    private int breath;  //   дыхание под водой

    public Whale(String name, int weight, int age, int breath) {
        super(name, weight, age);
        this.breath = breath;
    }

    public int getBreath() {
        return breath;
    }
    @Override
    public String toString() {
        
        return super.toString() + String.format(", breath: %d", breath);
    }

    @Override
    public String say() {
        return "clicking whistle";
    }

    @Override
    public int speedSwim() {
        return 60;
    }
}


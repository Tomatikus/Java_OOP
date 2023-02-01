public class Tiger extends Animal implements Runable {
    private String color;   //  окрас

    public Tiger(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(", color: %s", color);
    }

    @Override
    public String say() {
        return "Rrrrrrrr";
    }

    @Override
    public int speedRun() {
        return 70;
    }
}

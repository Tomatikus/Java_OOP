public abstract class Watterswim extends Animal{
    private int age;

    public Watterswim(String name, int weight, int age) {
        super(name, weight);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(", age: %d years", age);
    }

}

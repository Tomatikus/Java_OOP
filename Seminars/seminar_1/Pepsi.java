package Seminars.seminar_1;

public class Pepsi extends Product {
    private double liters;
    public Pepsi(String name, double cost, double liters) {
        super(name, cost);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " liters: %s",this.liters);
    }

    public double getliters() {
        return liters;
    }
} 


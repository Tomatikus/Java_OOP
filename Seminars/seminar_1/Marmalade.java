package Seminars.seminar_1;

public class Marmalade extends Product {
    private double netto;
    public Marmalade(String name, double cost, double netto) {
        super(name, cost);
        this.netto = netto;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " netto: %2s",this.netto);
    }

    public double getnetto() {
        return netto;
    }
}

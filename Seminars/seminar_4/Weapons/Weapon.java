package seminar_4.Weapons;
import seminar_4.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
}

package seminar_4;

import seminar_4.Weapons.Bow;
import seminar_4.Weapons.Shield;

public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, Shield shield) {
        super(name, healthPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
    
}

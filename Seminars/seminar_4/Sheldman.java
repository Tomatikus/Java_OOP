package seminar_4;

import seminar_4.Weapons.Shield;
import seminar_4.Weapons.Sword;

public class Sheldman extends Warrior {

    public Sheldman(String name, int healthPoint, Sword sword, Shield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Sheldman, " + super.toString();
    }
    
}

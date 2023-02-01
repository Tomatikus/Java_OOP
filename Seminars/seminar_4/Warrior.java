package seminar_4;

import seminar_4.Weapons.Shield;
import seminar_4.Weapons.Weapon;

public abstract class Warrior {
    private String name;
    private int healf;
    private Weapon weapon;
    private Shield shield;

    public Warrior(String name, int healf, Weapon weapon, Shield shield) {
        this.name = name;
        this.healf = healf;
        this.weapon = weapon;
        this.shield = shield;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public Shield getShield() {
        return shield;
    }
    @Override
    public String toString() {
        return " Name = " + name + ", healf = " + healf + ", weapon = " + weapon + ", shield = " + shield;
    }
}

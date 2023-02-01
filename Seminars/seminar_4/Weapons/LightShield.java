package seminar_4.Weapons;

public class LightShield extends Shield {

    public LightShield(int blockdamage) {
        super(blockdamage);
    }

    @Override
    public int Protect() {
        return 10;
    }

    @Override
    public String toString() {
        return "LightShield, " + super.toString();
    }
    
}

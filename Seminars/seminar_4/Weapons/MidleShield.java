package seminar_4.Weapons;

public class MidleShield extends Shield{

    public MidleShield(int blockdamage) {
        super(blockdamage);
    }

    @Override
    public int Protect() {
        return 40;
    }

    @Override
    public String toString() {
        return "MidleShield, " + super.toString();
    }
    
}

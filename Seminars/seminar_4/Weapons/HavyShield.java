package seminar_4.Weapons;

public class HavyShield extends Shield {

    public HavyShield(int blockdamage) {
        super(blockdamage);
    }

    @Override
    public int Protect() {
        return 60;
    }
    
    @Override
    public String toString() {
        
        return "HavyShield, " + super.toString();
    }

}

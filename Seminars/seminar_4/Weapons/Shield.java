package seminar_4.Weapons;

public abstract class Shield implements Protection{
    protected int blockdamage;

    public Shield(int blockdamage) {
        this.blockdamage = blockdamage;
    }

    @Override
    public String toString() {
        return "  blockdamage = " + blockdamage +"\n";
    }

    public int getblockdamage() {
        return blockdamage;
    }
    
}

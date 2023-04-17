package C2L2;

public class Gryffindor extends Hogwarts {
    private static final String houseName = "Gryffindor";
    private int bravery,
            honor,
            chivalry;

    public Gryffindor(int bravery, int honor, int chivalry) {
        super("", "", 0, 0);
        this.bravery = bravery;
        this.honor = honor;
        this.chivalry = chivalry;
    }

    public Gryffindor(Hogwarts hogwarts, int bravery, int honor, int chivalry) {
        super(hogwarts.getName(), hogwarts.getLastName(), hogwarts.getMagicPower(), hogwarts.getTransgressionRange());
        this.bravery = bravery;
        this.honor = honor;
        this.chivalry = chivalry;
    }

    public void setCommon(Hogwarts hogwarts) {
        setName(hogwarts.getName());
        setLastName(hogwarts.getLastName());
        setMagicPower(hogwarts.getMagicPower());
        setTransgressionRange(hogwarts.getTransgressionRange());
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getChivalry() {
        return chivalry;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + super.toString() +
                "bravery=" + bravery +
                ", honor=" + honor +
                ", chivalry=" + chivalry +
                '}';
    }

    public String getHouseName() {
        return houseName;
    }
}

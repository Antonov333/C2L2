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


    public static void compareGryffindorians(Gryffindor g1, Gryffindor g2) {
        int r1 = g1.rateAsGryffindorian();
        int r2 = g2.rateAsGryffindorian();
        if (r1 == r2) {
            System.out.println(g1.getFullName() + " with " + r1 + " points as Gryffindorian is same as "
                    + g2.getFullName() + " with " + r2 + " points");
            return;
        }
        if (r1 > r2) {
            System.out.println(g1.getFullName() + " with " + r1 + " points as Gryffindorian is better than "
                    + g2.getFullName() + " with " + r2 + " points");
        } else {
            System.out.println(g1.getFullName() + " with " + r1 + " points as Gryffindorian is worse than "
                    + g2.getFullName() + " with " + r2 + " points");
        }

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

    public int rateAsGryffindorian() {
        return bravery + honor + chivalry;
    }

    public double rateOverall() {
        return (double) rateAsGryffindorian() / 3.0 + (double) (super.getMagicPower() + super.getTransgressionRange());
    }

    public void compareWith(Gryffindor gryffindor) {

        int r1 = rateAsGryffindorian();
        int r2 = gryffindor.rateAsGryffindorian();
        if (r1 == r2) {
            System.out.println(getFullName() + " with " + r1 + " points as Gryffindorian is same as "
                    + gryffindor.getFullName() + " with " + r2 + " points");
            return;
        }
        if (r1 > r2) {
            System.out.println(getFullName() + " with " + r1 + " points as Gryffindorian is better than "
                    + gryffindor.getFullName() + " with " + r2 + " points");
        } else {
            System.out.println(getFullName() + " with " + r1 + " points as Gryffindorian is worse than "
                    + gryffindor.getFullName() + " with " + r2 + " points");
        }

    }

    public void printAbout() {
        System.out.println(getFullName() + " is a student of " + getHouseName() + " house in " + getSchoolName());
        System.out.println("Capable of " + super.getMagicPower() + "points of magic power");
    }
}



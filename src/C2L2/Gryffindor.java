package C2L2;

public class Gryffindor extends Hogwarts {
    private static final String houseName = "Gryffindor";
    private int bravery,
            honor,
            chivalry;


    public Gryffindor(String name, String lastName, int magicPower, int transgressionRange, int bravery, int honor, int chivalry) {
        super(name, lastName, magicPower, transgressionRange);
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
        return super.toString() +
                "\nAs a member of " + houseName + " house capable of bravery of " + bravery + " points, honor of "
                + honor + " points, chivalry of " + chivalry + " points\n";
    }

    public String getHouseName() {
        return houseName;
    }

    public int rateAsGryffindorian() {
        return bravery + honor + chivalry;
    }

    public double rateOverall() {
        return (double) rateAsGryffindorian() / 3.0 + super.rateOverall();
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

    public void printAboutDraft() {
        System.out.println("\n" + getFullName() + " is a student of " + getHouseName() + " house in " + getSchoolName());
        System.out.print("Capable of " + getMagicPower() + " points of magic power and " + getTransgressionRange()
                + " transgression range, ");
        System.out.println("and also of " + bravery + " points of bravery, " + honor + " points of honor, and " +
                chivalry + " points of chivalry\n");

    }

    public void printAbout() {
        System.out.println(this);
    }
}



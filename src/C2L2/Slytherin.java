package C2L2;

public class Slytherin extends Hogwarts {

    private static final String houseName = "Slytherin";

    private int ambition, cunning, leadership, resourcefulness;

    public Slytherin(String name, String lastName, int magicPower, int transgressionRange,
                     int ambition, int cunning, int leadership, int resourcefulness) {
        super(name, lastName, magicPower, transgressionRange);
        this.ambition = ambition;
        this.cunning = cunning;
        this.leadership = leadership;
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void printAbout() {
        System.out.println(this);
    }

    @Override
    public String toString() { //ambition, cunning, leadership, resourcefulness
        return super.toString() + "\nAs a member of " + houseName + " house capable with ambition of " + ambition +
                " points, cunning of " + cunning +
                " points, leadership of " + leadership + " points,  and resourcefulness of " + resourcefulness +
                " points\n";
    }

    public int rateAsSlytherian() {
        return ambition + cunning + leadership + resourcefulness;
    }

    public double rateOverall() {
        return super.rateOverall() + (rateAsSlytherian() / 4.0);
    }

    public void compareWith(Slytherin slytherin) {
        int r1 = rateAsSlytherian();
        int r2 = slytherin.rateAsSlytherian();
        System.out.print(getFullName() + " with " + r1 + " points as Slytherian is ");
        if (r1 == r2) {
            System.out.print("same as ");
        }
        if (r1 > r2) {
            System.out.print("better than ");
        }
        if (r1 < r2) {
            System.out.print("worse than ");
        }
        System.out.println(slytherin.getFullName() + " with " + r2 + " points");

    }
}

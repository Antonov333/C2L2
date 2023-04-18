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

    public void compareWith(Slytherin slytherin) {

    }
}

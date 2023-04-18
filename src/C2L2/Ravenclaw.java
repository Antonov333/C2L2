package C2L2;

public class Ravenclaw extends Hogwarts {

    private static final String houseName = "Ravenclaw";

    private int intelligence, creativeness, wisdom, wit;

    public Ravenclaw(String name, String lastName, int magicPower, int transgressionRange, int intelligence, int creativeness, int wisdom, int wit) {
        super(name, lastName, magicPower, transgressionRange);
        this.intelligence = intelligence;
        this.creativeness = creativeness;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCreativeness() {
        return creativeness;
    }

    public void setCreativeness(int creativeness) {
        this.creativeness = creativeness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCommon(Hogwarts hogwarts) {
        setName(hogwarts.getName());
        setLastName(hogwarts.getLastName());
        setMagicPower(hogwarts.getMagicPower());
        setTransgressionRange(hogwarts.getTransgressionRange());
    }

    @Override
    public String toString() {
        return super.toString() + "\nAs a member of " + houseName + " house capable with intelligence of " + intelligence +
                " points, creativeness of " + creativeness +
                "points, wisdom of " + wisdom + " points,  and wit of " + wit +
                " points";
    }

    public void printAbout() {
        System.out.println(this);
    }

    public int rateAsRavenclawian() {
        return intelligence + creativeness + wisdom + wit;
    }

    public void compareWith(Ravenclaw ravenclaw) {
        int r1 = rateAsRavenclawian();
        int r2 = ravenclaw.rateAsRavenclawian();
        if (r1 == r2) {
            System.out.println(getFullName() + " with " + r1 + " points as Ravenclawian is same as "
                    + ravenclaw.getFullName() + " with " + r2 + " points");
            return;
        }
        if (r1 > r2) {
            System.out.println(getFullName() + " with " + r1 + " points as Ravenclawian is better than "
                    + ravenclaw.getFullName() + " with " + r2 + " points");
        } else {
            System.out.println(getFullName() + " with " + r1 + " points as Ravenclawian is worse than "
                    + ravenclaw.getFullName() + " with " + r2 + " points");
        }

    }

    public double rateOverall() {
        return (double) (rateAsHogwartian()) + (double) (rateAsRavenclawian() / 4.0);
    }


}

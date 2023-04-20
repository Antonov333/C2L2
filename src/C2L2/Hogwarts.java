package C2L2;

public abstract class Hogwarts {

    private final static String schoolName = "Hogwarts School of Witchcraft and Wizardry";
    private String name;
    private String lastName;
    private int magicPower;
    private int transgressionRange;

    public Hogwarts(String name, String lastName, int magicPower, int transgressionRange) {
        this.name = name;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return schoolName + " student " + getFullName() + " is capable of magic power of " + magicPower +
                " and transgression range of " + transgressionRange +
                " points";
    }

    public int rateAsHogwartian() {
        return magicPower + transgressionRange;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public double rateOverall() {
        return rateAsHogwartian();
    }

    public void compare(Hogwarts h) {
        int r1 = rateAsHogwartian();
        int r2 = h.rateAsHogwartian();
        System.out.print(getFullName() + " with " + r1 + " points as Hogwartian is ");
        if (r1 == r2) {
            System.out.print("same as ");
        }
        if (r1 > r2) {
            System.out.print("better than ");
        }
        if (r1 < r2) {
            System.out.print("worse than ");
        }
        System.out.println(h.getFullName() + " with " + r2 + " points\n");

    }

    public void compareOverall(Hogwarts h) {
        double r1 = rateOverall();
        double r2 = h.rateOverall();
        System.out.print(getFullName() + " with " + r1 + " overall rating is ");
        if (java.lang.Math.abs(r1 - r2) < 0.1) {

            System.out.print("almost same as ");
        }
        if (r1 > r2) {
            System.out.print("better than ");
        }
        if (r1 < r2) {
            System.out.print("worse than ");
        }
        System.out.println(h.getFullName() + " with " + r2 + " rating\n");

    }

    public void printOverallRating() {
        System.out.println(getFullName() + "'s overall rating is " + rateOverall());
    }
}

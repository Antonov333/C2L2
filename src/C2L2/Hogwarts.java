package C2L2;

public class Hogwarts {

    public static void compareHogwartians(Hogwarts h1, Hogwarts h2) {
        int r1 = h1.rateAsHogwartian();
        int r2 = h2.rateAsHogwartian();

        if (r1 == r2) {
            System.out.println(h1.getFullName() + " with " + r1 + " points as Hogwartian is same as "
                    + h2.getFullName() + " with " + r2 + " points");
            return;
        }
        if (r1 > r2) {
            System.out.println(h1.getFullName() + " with " + r1 + " points as Hogwartian is better than "
                    + h2.getFullName() + " with " + r2 + " points");
        } else {
            System.out.println(h1.getFullName() + " with " + r1 + " points as Hogwartian is worse than "
                    + h2.getFullName() + " with " + r2 + " points");
        }

    }

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
        return (double) rateAsHogwartian();
    }

    public void compareOverall(Hogwarts h) {
        double r1 = rateOverall();
        double r2 = h.rateOverall();

    }
}

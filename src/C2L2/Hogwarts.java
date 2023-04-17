package C2L2;

public class Hogwarts {

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
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionRange=" + transgressionRange +
                '}';
    }
}

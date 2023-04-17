package C2L2;

public class Hufflepuff extends Hogwarts {
    private static final String houseName = "Hufflepuff";
    private int hardWork;
    private int patience;
    private int justice;
    private final int loyalty;

    public Hufflepuff(Hogwarts hogwarts, int hardWork, int patience, int justice, int loyalty) {
        super(hogwarts.getName(), hogwarts.getLastName(), hogwarts.getMagicPower(), hogwarts.getTransgressionRange());
        this.hardWork = hardWork;
        this.patience = patience;
        this.justice = justice;
        this.loyalty = loyalty;
    }

    public void setCommon(Hogwarts hogwarts) {
        setName(hogwarts.getName());
        setLastName(hogwarts.getLastName());
        setMagicPower(hogwarts.getMagicPower());
        setTransgressionRange(hogwarts.getTransgressionRange());
    }

    public int gethardWork() {
        return hardWork;
    }

    public void sethardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getpatience() {
        return patience;
    }

    public void setpatience(int patience) {
        this.patience = patience;
    }

    public int getjustice() {
        return justice;
    }

    public void setjustice(int justice) {
        this.justice = justice;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "hardWork=" + hardWork +
                ", patience=" + patience +
                ", justice=" + justice +
                ", loyalty=" + loyalty +
                '}';
    }

    public String getHouseName() {
        return houseName;
    }
}

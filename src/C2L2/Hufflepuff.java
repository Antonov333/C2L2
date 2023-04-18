package C2L2;

public class Hufflepuff extends Hogwarts {
    private static final String houseName = "Hufflepuff";
    private int hardWork;
    private int patience;
    private int justice;
    private int loyalty;

    public Hufflepuff(String name, String lastName, int magicPower, int transgressionRange, int hardWork, int patience, int justice, int loyalty) {
        super(name, lastName, magicPower, transgressionRange);
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
        return "\n" + super.toString() +
                "\nAs a member of " + houseName + " house capable of hard work of " + hardWork + " points, patience of "
                + patience + " points, justice of " + justice + " points, and loyalty of " + loyalty + " points";
    }

    public String getHouseName() {
        return houseName;
    }

    public int rateAsHufflePuff() {
        return hardWork + patience + justice + loyalty;
    }

    public double rateOverall() {
        return (double) rateAsHufflePuff() / 4.0 + (double) (super.rateAsHogwartian());
    }

    public void printAbout() {
        System.out.println(this);
    }

    public int rateAsHufflepuffian() {
        return super.rateAsHogwartian() + hardWork + patience + justice + loyalty;
    }

    public void compareWith(Hufflepuff hufflepuff) {
        int r1 = rateAsHufflepuffian();
        int r2 = hufflepuff.rateAsHufflepuffian();
        System.out.println(getFullName() + " with " + r1 + " points as Hufflepuffian is ");
        if (r1 == r2) {
            System.out.print("same as ");
        }
        if (r1 > r2) {
            System.out.println("better than ");
        }
        if (r1 < r2) {
            System.out.println("worse than ");
        }
        System.out.println(hufflepuff.getFullName() + " with " + r2 + " points");

    }

//    public compareHufflepuffians(Hufflepuff h1, Hufflepuff h2) {

}

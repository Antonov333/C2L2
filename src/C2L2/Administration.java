package C2L2;

public class Administration {
    public static void compareHogwartians(Hogwarts h1, Hogwarts h2) {
        int r1 = h1.rateAsHogwartian();
        int r2 = h2.rateAsHogwartian();
        System.out.print(h1.getFullName() + " with " + r1 + " points as Hogwartian is ");
        if (r1 == r2) {
            System.out.print("same as ");
        }
        if (r1 > r2) {
            System.out.print("better than ");
        }
        if (r1 < r2) {
            System.out.print("is worse than ");
        }
        System.out.println(h2.getFullName() + " with " + r2 + " points\n");
    }

    public static void compareOverall(Hogwarts h1, Hogwarts h2) {
        double r1 = h1.rateOverall();
        double r2 = h2.rateOverall();
        System.out.print(h1.getFullName() + " with " + r1 + " overall rating is ");
        if (java.lang.Math.abs(r1 - r2) < 0.1) {

            System.out.print("almost same as ");
        }
        if (r1 > r2) {
            System.out.print("better than ");
        }
        if (r1 < r2) {
            System.out.print("worse than ");
        }
        System.out.println(h2.getFullName() + " with " + r2 + " rating\n");

    }
}

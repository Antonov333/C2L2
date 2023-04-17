package C2L2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2 Lesson 2\nOOP, part1: Encapsulation and Inheritance");

        Hogwarts hogwarts = new Hogwarts("Harry", "Potter", 50, 50);
        System.out.println(hogwarts.getSchoolName());
        Gryffindor harryPotter = new Gryffindor(75, 75, 75);
        harryPotter.setCommon(hogwarts);
        System.out.println("harryPotter.toString() = " + harryPotter);

        hogwarts.setName("Hermione");
        hogwarts.setLastName("Granger");
        hogwarts.setMagicPower(51);
        hogwarts.setTransgressionRange(51);
        Gryffindor hermioneGranger = new Gryffindor(hogwarts, 76, 76, 76);
        System.out.println(hermioneGranger);
    }
}
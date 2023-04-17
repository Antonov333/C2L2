package C2L2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2 Lesson 2\nOOP, part1: Encapsulation and Inheritance");

        Random r = new Random();

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
        System.out.println("hermioneGranger = " + hermioneGranger);

        hogwarts = new Hogwarts("Ron", "Weasley", 40, 40);
        Gryffindor ronWeasley = new Gryffindor(hogwarts, 70, 70, 70);
        System.out.println("ronWeasley = " + ronWeasley);

        // На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.

        hogwarts = new Hogwarts("Zacharias", "Smith", 45, 45);
        Hufflepuff zachariasSmith = new Hufflepuff(hogwarts, r.nextInt(40, 80), r.nextInt(40, 80), 50, 50);
        System.out.println("zachariasSmith = " + zachariasSmith);


        hogwarts = new Hogwarts("Cedric", "Diggory", r.nextInt(10, 90), r.nextInt(10, 90));
        Hufflepuff cedricDiggory = new Hufflepuff(hogwarts, r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        System.out.println("cedricDiggory = " + cedricDiggory);

    }
}
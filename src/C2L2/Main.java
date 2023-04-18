package C2L2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2 Lesson 2\nOOP, part1: Encapsulation and Inheritance");

        Random r = new Random();

        Hogwarts hogwarts = new Hogwarts("Harry", "Potter", 50, 50);
        System.out.println(hogwarts.getSchoolName());
        Gryffindor harryPotter = new Gryffindor(r.nextInt(99), r.nextInt(99), r.nextInt(99));
        harryPotter.setCommon(hogwarts);
        System.out.println("harryPotter.toString() = " + harryPotter);

        hogwarts.setName("Hermione");
        hogwarts.setLastName("Granger");
        hogwarts.setMagicPower(r.nextInt(100));
        hogwarts.setTransgressionRange(r.nextInt(100));
        Gryffindor hermioneGranger = new Gryffindor(hogwarts, r.nextInt(100), r.nextInt(100), r.nextInt(100));
        System.out.println("hermioneGranger = " + hermioneGranger);

        hogwarts = new Hogwarts("Ron", "Weasley", r.nextInt(99), r.nextInt(99));
        Gryffindor ronWeasley = new Gryffindor(hogwarts, r.nextInt(99), r.nextInt(99), r.nextInt(99));
        System.out.println("ronWeasley = " + ronWeasley);

        hogwarts = new Hogwarts("Zacharias", "Smith", r.nextInt(99), r.nextInt(99));
        Hufflepuff zachariasSmith = new Hufflepuff(hogwarts, r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99));
        System.out.println("zachariasSmith = " + zachariasSmith);

        hogwarts = new Hogwarts("Cedric", "Diggory", r.nextInt(99), r.nextInt(99));
        Hufflepuff cedricDiggory = new Hufflepuff(hogwarts, r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        System.out.println("cedricDiggory = " + cedricDiggory);

        hogwarts = new Hogwarts("Justin", "Finch-Fletchley", r.nextInt(99), r.nextInt(99));
        Hufflepuff justinFinchFletchley = new Hufflepuff(hogwarts, r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        System.out.println("justinFinchFletchley = " + justinFinchFletchley);

        System.out.println("hermioneGranger.rateAsGryffindorian() = " + hermioneGranger.rateAsGryffindorian());
        System.out.println("hermioneGranger.rateOverall() = " + hermioneGranger.rateOverall());
        System.out.println("harryPotter.rateOverall() = " + harryPotter.rateOverall());

        System.out.println("cedricDiggory.rateOverall() = " + cedricDiggory.rateOverall());

        Gryffindor.compareGryffindorians(harryPotter, hermioneGranger);
        Gryffindor.compareGryffindorians(ronWeasley, harryPotter);

        harryPotter.compareWith(hermioneGranger);

        hermioneGranger.printAbout();

        Hogwarts.compareHogwartians(harryPotter, cedricDiggory);

    }
}
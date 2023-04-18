package C2L2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2 Lesson 2\nOOP, part1: Encapsulation and Inheritance");

        Random r = new Random();


        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));
        harryPotter.printAbout();

        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));

        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharia", "Smith", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));
        zachariasSmith.printAbout();

        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));

        Hufflepuff justinFinchFletchley = new Hufflepuff("Cedric", "Diggory", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));
        cedricDiggory.printAbout();

        System.out.println("hermioneGranger.rateAsGryffindorian() = " + hermioneGranger.rateAsGryffindorian());
        System.out.println("hermioneGranger.rateOverall() = " + hermioneGranger.rateOverall() + "\n");
        System.out.println("harryPotter.rateOverall() = " + harryPotter.rateOverall() + "\n");

        System.out.println("cedricDiggory.rateOverall() = " + cedricDiggory.rateOverall() + "\n");

        Gryffindor.compareGryffindorians(harryPotter, hermioneGranger);
        Gryffindor.compareGryffindorians(ronWeasley, harryPotter);

        harryPotter.compareWith(hermioneGranger);

        Hogwarts.compareHogwartians(harryPotter, cedricDiggory);
        harryPotter.printAbout();
        cedricDiggory.printAbout();

        Ravenclaw choChang = new Ravenclaw("Cho", "Chang", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100));
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100));
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100));

        choChang.printAbout();
        padmaPatil.printAbout();
        marcusBelby.printAbout();

        zachariasSmith.compareWith(cedricDiggory);

        /**
         * Slytherin
         * Драко Малфой, Грэхэм Монтегю, Грегори Гойл
         *
         * */
    }
}
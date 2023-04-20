package C2L2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2 Lesson 2\nOOP, part1: Encapsulation and Inheritance" +
                "\n-----------------------------------------\n");

        Random r = new Random();

        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));
        harryPotter.printAbout();

        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));
        hermioneGranger.printAbout();

        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", r.nextInt(100), r.nextInt(100),
                r.nextInt(100), r.nextInt(100), r.nextInt(100));
        ronWeasley.printAbout();

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharia", "Smith", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));
        zachariasSmith.printAbout();

        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));

        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", r.nextInt(99), r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(100), r.nextInt(100));
        cedricDiggory.printAbout();

        harryPotter.compareWith(hermioneGranger);

        harryPotter.compare(cedricDiggory);
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

        padmaPatil.compareWith(choChang);

        zachariasSmith.compareWith(cedricDiggory);

        zachariasSmith.compareOverall(hermioneGranger);

        choChang.compareOverall(cedricDiggory);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        dracoMalfoy.printAbout();

        Slytherin grahamMontague = new Slytherin("Graham", "Montague", r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        grahamMontague.printAbout();

        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", r.nextInt(99), r.nextInt(99),
                r.nextInt(99), r.nextInt(99), r.nextInt(99), r.nextInt(99));
        gregoryGoyle.printAbout();

        Administration.compareHogwartians(dracoMalfoy, harryPotter);
        harryPotter.compare(dracoMalfoy);

        dracoMalfoy.compareOverall(harryPotter);
        dracoMalfoy.compareWith(grahamMontague);

        gregoryGoyle.compareWith(grahamMontague);

        justinFinchFletchley.compareOverall(marcusBelby);

        padmaPatil.printAbout();
        padmaPatil.printOverallRating();

        Administration.compareOverall(padmaPatil, zachariasSmith);
    }

}
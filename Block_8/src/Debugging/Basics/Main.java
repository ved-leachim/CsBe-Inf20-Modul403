package Debugging.Basics;

import java.util.Random;

public class Main {

    static Random randomizer = new Random();
    static Hunter[] topHunters = new Hunter[5];

    public static void main(String[] args) {
        Hunter hunter1 = new Hunter("Gon", "Freecss", 12);
        topHunters[0] = hunter1;
        Hunter hunter2 = new Hunter("Killua", "Zoldyck", 12);
        topHunters[1] = hunter2;
        Hunter hunter3 = new Hunter("Kurapika","",17);
        topHunters[2] = hunter3;
        Hunter hunter4 = new Hunter("Leorio", "Paradinight", 19);
        topHunters[3] = hunter4;
        Hunter hunter5 = new Hunter("Hisoka", "Morow", 0);
        topHunters[4] = hunter5;

        System.out.println(getPersonsFullName(hunter1));
        System.out.println("Der Hunter ist " + getHuntersAge(hunter1) + " Jahre alt.");
        printAllTopHunters(topHunters);
        System.out.println("Zufällig ausgewählt wurde: " + pickRandomHunter(topHunters));
    }

    static String getPersonsFullName(Hunter hunter){
        String firstName = hunter.getFirstName();
        String lastName = hunter.getLastName();
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    static void printAllTopHunters(Hunter... hunter){
        for(int i = 0; i < topHunters.length; i++){
            System.out.println("Top Hunter: " + hunter[i].getFirstName());
        }
    }

    static String pickRandomHunter(Hunter... hunter){
        return hunter[randomizer.nextInt(5)].getFirstName();
    }

    static int getHuntersAge(Hunter hunter){
        return hunter.getAge();
    }

}

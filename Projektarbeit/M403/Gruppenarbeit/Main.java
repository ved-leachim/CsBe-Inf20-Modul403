package Gruppenarbeit;

import java.util.Scanner;

public class Main {
    static int personCounter = 0;
    static Person[] registeredPerson = new Person[10];
    static Scanner scan = new Scanner(System.in);

    static void emptyLine() {System.out.println();}

    static void sternlinie() {
        System.out.println("**************************************************************");
    }

    static void menu() { //Startmenü
        sternlinie();
        System.out.println("Version 1.0");
        sternlinie();
        System.out.println("Startmenü");
        System.out.println("Drücken Sie die Entsprechende Taste um eine Option auszuwählen");
        sternlinie();
        System.out.println("Drücken Sie 0 um das Programm zu schliessen");
        System.out.println("Drücken Sie 1 um eine neue Person einzufügen");
        System.out.println("Drücken Sie 2 um all Personen auflisten");
        sternlinie();
        emptyLine();
    }

    static void programmSchliessen() { //Hier wird das Programm geschlossen
        sternlinie();
        System.out.println("Sie haben Option 0 gewählt.");
        System.out.println("Das Programm wird geschlossen");
        sternlinie();
        System.exit(0);
    }

    static void personEinfuegen() { //Hier wird eine neue Person eingefügt
        Person newPerson = new Person();
        sternlinie();
        System.out.println("Sie haben Option 1 gewählt.");
        System.out.println("Person eintragen");
        sternlinie();
        System.out.print("Geben Sie Ihren Vornamen ein: ");
        String firstName = scan.nextLine();
        System.out.print("Geben Sie Ihren Nachnamen ein: ");
        String lastName = scan.nextLine();
        System.out.print("Geben Sie Ihr Alter ein: ");
        int age = Integer.parseInt(scan.nextLine());

        newPerson.setFirstName(firstName);
        newPerson.setLastName(lastName);
        newPerson.setAge(age);

        if (age >= 16) {//Filtert das Alter
            System.out.print("Geben Sie bitte Ihre Strasse ein: ");
            String street = scan.nextLine();
            System.out.print("Geben Sie Ihre Postleitzahl an: ");
            String PLZ = scan.nextLine();
            System.out.print("Geben Sie Ihren Wohnort ein: ");
            String city = scan.nextLine();
            newPerson.setStreet(street);
            newPerson.setPLZ(PLZ);
            newPerson.setCity(city);
        }
        //Verwaltet die Person
        registeredPerson[personCounter] = newPerson;
        personCounter++;

        sternlinie();
        System.out.println("Person erfolgreich eingetragen");
        emptyLine();
    }

    static void personenAbrufen() {// Hier wird die Ausgabe durchgeführt.
        if (personCounter > 0) {
                sternlinie();
                System.out.println("Sie haben Option 2 gewählt.");
                System.out.println("Personen auflisten");
                sternlinie();
            for (int i = 0; i < personCounter; i++) {
                    System.out.println("Person Nummer " + i);
                    System.out.println("Vorname: " + registeredPerson[i].getFirstName());
                    System.out.println("Nachname: " + registeredPerson[i].getLastName());
                    System.out.println("Alter: " + registeredPerson[i].getAge());
                    System.out.println("Addrese: " + registeredPerson[i].getStreet() + ", " + (registeredPerson[i].getPLZ() + ", " + (registeredPerson[i].getCity())));
                    sternlinie();
                    emptyLine();
            }
        }
        else{
            System.out.println("Sie haben Option 2 gewählt.");
            System.out.println("Personen auflisten");
            sternlinie();
            System.out.println("Es wurden noch keine Personen erfasst!");
            sternlinie();
            emptyLine();
        }
    }
    public static void main(String[] args) {
        int benutzerEingabe;

        while (0 == 0) {
            menu();
            benutzerEingabe = Integer.parseInt(scan.nextLine());

            switch (benutzerEingabe) {
                case 0 -> programmSchliessen();//Hier wird das Programm geschlossen
                case 1 -> personEinfuegen();//Hier wird eine neue Person eingefügt
                case 2 -> personenAbrufen();//Hier werden die Personen aufgelistet
                default -> System.out.println("Wählen Sie eine gültige Funktion");//Für ungültige Eingaben
            }

        }
    }
}























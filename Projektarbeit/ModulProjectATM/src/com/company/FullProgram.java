package com.company;
import java.util.Scanner;

public class FullProgram {

    static Scanner scan = new Scanner(System.in);
    static Person[] personList = new Person[10];

    public static void main(String[] args) {

            welcomeScreen();
            scan.nextLine();

        while (true) {

            mainMenu();
            prozess();

            System.out.println("Drücken Sie auf 'Enter' zum weiterfahren");

            scan.nextLine();
        }
    }

    public static void welcomeScreen() {

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("¦                                                 Willkomen!                                                 ¦");
        System.out.println("¦                                                                                                            ¦");
        System.out.println("¦    Zum Navigieren drücken Sie auf die Zahl die den Optionen gegeben ist und bestätigen Sie mit 'Enter'     ¦");
        System.out.println("¦                                                                                                            ¦");
        System.out.println("¦                                 Drücken Sie auf `Enter` zum weiterfahren!                                  ¦");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

    }

    public static void mainMenu() {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------------Main Menu-------------------------------------------------");
        System.out.println("¦  1. Alle Benutzer anzeigen                                                                               ¦");
        System.out.println("¦  2. Neuen Benutzer hinzufügen                                                                            ¦");

        System.out.println("¦  8. About Us                                                                                             ¦");
        System.out.println("¦  9. Exit                                                                                                 ¦");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.print("Input : ");
    }

    public static void prozess() {

        switch (Integer.parseInt(scan.nextLine())) {

            case 1 :
                showUser();
                break;

            case 2 :
                addUser();
                break;

            case 8 :
                aboutUs();
                break;

            case 9 :
                System.out.println("System shutdown");
                System.exit(0);
                break;

            case 99 :
                easterEgg();
                break;

            default:
                System.out.println("Ungültige Eingabe");
                mainMenu();
        }

    }

    public static void showUser() {

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("¦                                              Benutzer Liste                                              ¦");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < personList.length; i++) {

            if (personList[i] != null) {
                System.out.println("- [" + personList[i].getFirstName() + ", " + personList[i].getLastName() + "]");
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public static void addUser() {

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("¦                                       Neuen Benutzer hinzufügen                                           ¦");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        int i = checkPersonEmpty();
        personList[i] = new Person();
        System.out.println("Bitte geben Sie Ihren Vornamen ein");
        System.out.print("> Vorname: ");
        personList[i].setFirstName(scan.nextLine());
        System.out.println("Bitte geben Sie Ihren Nachnamen ein");
        System.out.print("> Nachname: ");
        personList[i].setLastName(scan.nextLine());
        System.out.println("Bitte geben Sie Ihr Alter ein");
        System.out.print("> Alter: ");
        personList[i].setAge(Integer.parseInt(scan.nextLine()));
        if(personList[i].getAge() >= 16) {
            System.out.println("Weill Sie über sechzehn sind müssen Sie Ihre Addresse eingeben!");
            System.out.println("Bitte geben Sie Ihre Strasse ein");
            System.out.print("> Strasse: ");
            personList[i].setStreet(scan.nextLine());
            System.out.println("Bitte geben Sie Ihre Stadt ein");
            System.out.print("> Stadt: ");
            personList[i].setCity(scan.nextLine());
            System.out.println("Bitte geben Sie Ihre Postleitzahl ein");
            System.out.print("> PLZ: ");
            personList[i].setPLZ(Integer.parseInt(scan.nextLine()));
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Daten wurden erfolgreich gespeichert");
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public static void easterEgg() {
        System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
        System.out.println("Easter Egg Gefunden! Hallo Herr Schmitz!");
        System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
    }

    public static void aboutUs() {

        System.out.println("");
        System.out.println("   ___                       _                 ______                             _ ");
        System.out.println("  |_  |                     (_)        ___     |  _  \\                           | |");
        System.out.println("    | |  __ _  _ __   _ __   _  ___   ( _ )    | | | | __ _  _ __   _   _   __ _ | |");
        System.out.println("    | | / _` || '_ \\ | '_ \\ | |/ __|  / _ \\/ \\ | | | |/ _` || '_ \\ | | | | / _` || |");
        System.out.println("/\\__/ /| (_| || | | || | | || |\\__ \\ | (_>  <  | |/ /| (_| || | | || |_| || (_| || |");
        System.out.println("\\____/  \\__,_||_| |_||_| |_||_||___/  \\___/\\/  |___/  \\__,_||_| |_| \\__, | \\__,_||_|");
        System.out.println("                                                                    __/ |          ");
        System.out.println("                                                                   |___/");
        System.out.println("");
        System.out.println("Copyright (c) Jannis & Danyal 2020");
        System.out.println("");

    }

    static int checkPersonEmpty() {

        int emptyList = 0;

        for(int i = 0; i < personList.length; i++) {

            if(personList[i] == null) {
                emptyList = i;
                break;
            }
        }
        return emptyList;
    }

}


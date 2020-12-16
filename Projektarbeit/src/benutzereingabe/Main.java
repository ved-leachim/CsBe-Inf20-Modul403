package benutzereingabe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static Person[] alluser = new Person[10];

    static int eingabe;
    static int beenden;
    static int usernumber;
    static int WitzNumber;
    static int löschen;
    static int deletenumber;


    public static void alluser() {
        if (usernumber < 10) {
            System.out.println("Die Person wurde Erfolgreich regristriert.");
            usernumber++;
        } else {
            System.out.println("Die Maximale anzahl an Personen (10) wurde bereits ereicht");
        }
    }

    public static void Startmenu() throws InterruptedException {

        String wilkommen =
                "--------------------------------------------------------------------------\n" +
                        "██        █    ███████      ██                ██\n" +
                        "█ █       █   █       █     █ █              █ █\n" +
                        "█  █      █   █             █  █            █  █\n" +
                        "█   █     █   █             █   █          █   █\n" +
                        "█    █    █    ███████      █    █        █    █\n" +
                        "█     █   █            █    █     █      █     █\n" +
                        "█      █  █            █    █      █    █      █\n" +
                        "█       █ █   █        █    █       █  █       █\n" +
                        "█        ██    ████████     █        ██        █\n" +
                        " \n ====================================================================== \n " +
                        "Herzlich Wilkommen bei NSM \n ====================================================================== \n" +
                        " Um NSM zu verwenden, drücken Sie eine Beliebige Taste: \n" +
                        " ---------------------------------------------------------------------- \n ";


        for (int i = 0; i < wilkommen.length(); i++) {
            System.out.print(wilkommen.charAt(i));
            Thread.sleep(5);
        }
        scan.nextLine();

    }

    public static void Witze() {
        WitzNumber = 0;
        Random witz = new Random();
        WitzNumber = witz.nextInt(6);


        switch (WitzNumber) {
            case 0:
                System.out.println("======================================================================");
                System.out.println("Beim Doktor:\n" +
                        "-\n" +
                        "Haben Sie meinen Ratschlag befolgt und mit offenem Fenster geschlafen?\n" +
                        "-\n" +
                        "Ja, habe ich.\n" +
                        "-\n" +
                        "Und, ist der Husten verschwunden?\n" +
                        "-\n" +
                        "Das einzige was verschwunden ist, ist mein Laptop und mein Smartphone.");

                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 1:
                System.out.println("======================================================================");
                System.out.println("Verkäufer:\n" +
                        "Dieser Computer nimmt Ihnen die Hälfte der Arbeit ab!\n" +
                        "Darauf der Kunde: \n" +
                        "Dann packen Sie mir doch zwei davon ein!");

                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 2:
                System.out.println("======================================================================");
                System.out.println("Eine Frau ist wie ein offenes Buch. Über Microbiologie. Mit über 2000 Seiten. In Blindenschrift.");

                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 3:
                System.out.println("======================================================================");
                System.out.println("Wie zieht ein Informatiker seine Freundin aus? \n" +
                        "getStringFromObject()");
                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 4:
                System.out.println("======================================================================");
                System.out.println("Why do Java developers wear glasses? \n" +
                        "Because they don’t C#\n");
                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 5:
                System.out.println("======================================================================");
                System.out.println("Warum lieben Frauen objektorientierte Programmierer?\n" +
                        "Weil sie Klasse haben\n");
                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 6:
                System.out.println("======================================================================");
                System.out.println("Was sagt ein Informatiker, wenn er auf die Welt kommt\n" +
                        "\n" +
                        "Hello World!\n");
                System.out.println("======================================================================");
                System.out.println("Um fortzufahren, drücken Sie eine beliebige Taste: ");
                System.out.println("----------------------------------------------------------------------");
                scan.nextLine();
                break;
        }

    }

    public static void Hauptmenu() {
        System.out.println("======================================================================");
        System.out.println("Drücke die 1 um eine Personen Hinzufgügen");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Drücke die 2 um alle Personen Wiederzugeben");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Drücke die 3 um eine Person zu löschen");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Drücke die 4 um das Programm zu beenden");
        System.out.println("======================================================================");
        System.out.println("Aktuell sind " + usernumber + " Personen in der Liste vorhanden.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Um einen beliebigen Witz Auszugeben, drücken Sie 5 :)");
        System.out.println("----------------------------------------------------------------------");
    }

    public static void user() throws InterruptedException {
        if (usernumber > 9) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Sie haben die Maximale anzahl an Personen bereits eingetragen");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Drücken sie ine beliebige taste um fortzufahren");
            scan.nextLine();
        } else {

            Person newPerson = new Person();
            System.out.println("Geben sie ihren Vornamen ein: ");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Geben sie ihr Nachnamen ein: ");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Geben sie ihr Alter ein: ");
            newPerson.setAge(Integer.parseInt(scan.nextLine()));
            if (newPerson.getAge() < 16) {
                alluser[usernumber] = newPerson;
                usernumber++;
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Ihre Person wurde erfolgreich Regristriert");
                System.out.println("----------------------------------------------------------------------");
                Thread.sleep(1000);
            } else {
                System.out.println("Geben sie Ihre Strasse ein");
                newPerson.setStreet(scan.nextLine());
                System.out.println("Geben sie Ihr Wohnort ein");
                newPerson.setCity(scan.nextLine());
                System.out.println("Geben sie Ihren PLZ ein");
                newPerson.setPLZ(Integer.parseInt(scan.nextLine()));
                alluser[usernumber] = newPerson;
                usernumber++;
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Ihre Person wurde erfolgreich Regristriert");
                System.out.println("----------------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }
    }

    public static void wiedergabe() {

        System.out.println("==========================================================================");
        System.out.println("Nummer   Vorname     Nachname     Alter     Strasse     Ort     PLZ");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < usernumber; i++) {
            System.out.println("  " + i + "       " + alluser[i].getFirstName() + "     " + alluser[i].getLastName() + "     " + alluser[i].getAge() + "     " + alluser[i].getStreet() + "     " + alluser[i].getCity() + "     " + alluser[i].getPLZ());
        }
        System.out.println("===========================================================================");

    }

    public static void löschen() throws InterruptedException {

        deletenumber = 0;

        wiedergabe();
        System.out.println("Geben sie die Nummer der Person ein die sie Löschen wollen.");
        löschen = Integer.parseInt(scan.nextLine());
        switch (löschen) {
            case 0:
                deletenumber = 0;
                break;
            case 1:
                deletenumber = 1;
                break;
            case 2:
                deletenumber = 2;
                break;
            case 3:
                deletenumber = 3;
                break;
            case 4:
                deletenumber = 4;
                break;
            case 5:
                deletenumber = 5;
                break;
            case 6:
                deletenumber = 6;
                break;
            case 7:
                deletenumber = 7;
                break;
            case 8:
                deletenumber = 8;
                break;
            case 9:
                deletenumber = 9;
                break;
            default:
                System.out.println("Diese Person existiert nicht.");

        }
        if (deletenumber > 9) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Drücken sie ine beliebige taste um fortzufahren");
            System.out.println("--------------------------------------------------------------------------");
            scan.nextLine();
        } else {
            Person newPerson = new Person();
            alluser[deletenumber] = newPerson;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ihre Person wurde erfolgrreich gelöscht");
            System.out.println("--------------------------------------------------------------------------");

            Thread.sleep(1000);
        }

    }


    public static void ausführen() throws InterruptedException {
        eingabe = Integer.parseInt(scan.nextLine());
        switch (eingabe) {
            case 1:
                user();
                break;
            case 2:
                wiedergabe();
                System.out.println("Drücken sie ine beliebige taste um fortzufahren");
                System.out.println("--------------------------------------------------------------------------");
                scan.nextLine();
                break;
            case 3:
                löschen();
                break;
            case 4:
                beenden = 2;
                break;
            case 5:
                Witze();
                break;
            default:
                System.out.println("Diese funktion existiert nicht");
                Thread.sleep(1000);
        }

    }

    public static void Abspann() throws InterruptedException {
        String ende = "====================================================================== \n" +
                "Vielen Dank, dass Sie NSM benutzt haben! Auf Wiedersehen. \n" +
                "======================================================================\n" +
                "██        █    ███████      ██                ██\n" +
                "█ █       █   █       █     █ █              █ █\n" +
                "█  █      █   █             █  █            █  █\n" +
                "█   █     █   █             █   █          █   █\n" +
                "█    █    █    ███████      █    █        █    █\n" +
                "█     █   █            █    █     █      █     █\n" +
                "█      █  █            █    █      █    █      █\n" +
                "█       █ █   █        █    █       █  █       █\n" +
                "█        ██    ████████     █        ██        █\n" +

                " ---------------------------------\n " +
                "Programm developed by:\n " +
                "----------------------------------\n" +
                " Mike Thurm\n " +
                "----------------------------------\n" +
                " Severin Haslauer \n " +
                "----------------------------------\n" +
                " Nick Zeyer \n " +
                "----------------------------------\n";
        for (int i = 0; i < ende.length(); i++) {
            System.out.print(ende.charAt(i));
            Thread.sleep(5);
        }
    }

    public static void schleife() throws InterruptedException {
        do {
            Hauptmenu();
            ausführen();
        }
        while (beenden < 1);

    }

    public static void main(String[] args) throws InterruptedException {
        Startmenu();
        schleife();
        Abspann();
    }
}


package Basic;

import java.util.Scanner;

public class Main {
    public static Person[] registerdPerson = new Person[10];
    public static int personCount = 0;
    public static Scanner scan = new Scanner(System.in);
    public static int start = 0;

    public static void main(String[] args) {
        Hauptmenü();
    }

    static void Hauptmenü() {
        System.out.println(" ");
        if (start == 0) {
            System.out.println("Welcome to our Program");
            start++;
        }
        System.out.println("----------------------------------");
        System.out.println("Create a new Account    press 1");
        System.out.println("Show all account's      press 2");
        System.out.println("Stop the Program        press 3");
        System.out.println("---------------------------------");
        int input = scan.nextInt();

        if (input == 1) {
            Abfrage();
        } else if (input == 2) {
            AlleBenutzer();
        } else if (input == 3) {
            System.out.println("good Bye, see you next time");
            System.out.println("This code was made by Joao, Lakshan and William");
            System.exit(0);
        } else {
            System.out.println("Unable to process this Command");
            System.out.println("Please use one of the commands displayed");
            Hauptmenü();
        }

    }

    static void AlleBenutzer() {
        for (int i = 0; i < personCount; i++) {
            System.out.println(" ");
            System.out.println("User " + (i + 1));
            System.out.println("Firstname = " + registerdPerson[i].getFirstName());
            System.out.println("Lastname  = " + registerdPerson[i].getLastName());
            System.out.println("Age       = " + registerdPerson[i].getAge());
            if (registerdPerson[i].getAge() >= 16) {
                System.out.println("Address   = " + registerdPerson[i].getStreet());
                System.out.println("City      = " + registerdPerson[i].getCity());
                System.out.println("PLZ       = " + registerdPerson[i].getPLZ());
            }
        }
        Hauptmenü();
    }

    static void Abfrage() {
        while (true) {
            System.out.println(" ");
            System.out.println("what's your first Name?");
            String firstName = scan.next();
            System.out.println("What's your Last Name?");
            String lastName = scan.next();
            Person newPerson = new Person();
            newPerson.setFirstName(firstName);
            newPerson.setLastName(lastName);
            System.out.println("How old are you?");
            int age = scan.nextInt();
            newPerson.setAge(age);
            if (age >= 16) {
                System.out.println("Great you are " + age + " years old.");
                System.out.println("On wich street to you live on? (Only Street name)");
                String street = scan.next();
                newPerson.setStreet(street);
                System.out.println("In wich city do you live?");
                String city = scan.next();
                newPerson.setCity(city);
                System.out.println("What's your Postal code (PLZ)");
                int PLZ = scan.nextInt();
                newPerson.setPLZ(PLZ);
                System.out.println("Are the following information correct");
                System.out.println("Firstname = " + firstName);
                System.out.println("Lastname  = " + lastName);
                System.out.println("Age       = " + age);
                System.out.println("Address   = " + street);
                System.out.println("City      = " + city);
                System.out.println("PLZ       = " + PLZ);
                System.out.println(" ");
                System.out.println("y/n");
                String yes1 = scan.next();
                if (yes1.equals("y")) {
                    registerdPerson[personCount] = newPerson;
                    personCount++;
                } else if (yes1.equals("n")) {
                    System.out.println("Good luck next time");
                } else {
                    System.out.println("Unable to process Answer");
                }
            } else {
                System.out.println("Are the following information correct");
                System.out.println("Firstname = " + firstName);
                System.out.println("Lastname = " + lastName);
                System.out.println("Age = " + age);
                System.out.println(" ");
                System.out.println("y/n");
                String yes1 = scan.next();
                if (yes1.equals("y")) {
                    registerdPerson[personCount] = newPerson;
                    personCount++;
                } else if (yes1.equals("n")) {
                    System.out.println("Good luck next time");
                } else {
                    System.out.println("Unable to process Answer");
                }
            }
            break;
        }
        Hauptmenü();
    }
}
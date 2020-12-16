package M_403_Projektarbeit;

import java.util.Scanner;

public class Main {
    public static Person[] allePersonen = new Person[10];
    static int anzahlPers = 0;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hallo");


        ablauf();
    }
    private static void ablauf(){
        while (true) {

            //hier wird die begrüssung aufgerufen
            begruessung();
            //hier kommt abfrage auf input tasten 1-4
            String input = s.nextLine();
            if (input.equals("1")) {
                neuePerson();
            } else if (input.equals("2")) {
                allePersonen();
            } else if (input.equals("3")) {
                bestimmtePersonen();
            } else if (input.equals("4")) {
                System.exit(0);
            }
        }
    }
    private static void begruessung(){
        System.out.println("1 = Neue Person erstellen");
        System.out.println("2 = Alle Personen ausgeben");
        System.out.println("3 = Bestimmte Personen ausgeben");
        System.out.println("4 = Exit");
        }


    private static void bestimmtePersonen() {

        System.out.println("Nachname zum suchen eingeben");
        String name = s.nextLine();
        for (int x = 0; x < anzahlPers; x++) {

            if (allePersonen[x].getLastName().equals(name)) {
                System.out.println(allePersonen[x].getFirstName() + " " + allePersonen[x].getLastName() + " " + allePersonen[x].getAge());
                if (allePersonen[x].getCity() != null) {
                    System.out.println(allePersonen[x].getCity() + " " + allePersonen[x].getPLZ() + " " + allePersonen[x].getStreet());
                }
            } /*else {
                System.out.println("Nachname wurde nicht gefunden");
            }*/
        }
    }

    public static void neuePerson() {

        Person neuePerson = new Person();

        //vorname eingabe
        System.out.println("Vorname eingeben");
        neuePerson.setFirstName(s.nextLine());

        //nachname eingabe
        System.out.println("Nachname eingeben");
        neuePerson.setLastName(s.nextLine());

        //alter eingabe
        System.out.println("Alter eingeben");
        neuePerson.setAge(s.nextInt());
        s.nextLine();

        //abfrage ob alter über 16
        if (neuePerson.getAge() > 16) {

            //Stadt eingabe
            System.out.println("Stadt eingeben");
            neuePerson.setCity(s.nextLine());

            //PLZ eingabe
            System.out.println("PLZ eingeben");
            neuePerson.setPLZ(s.nextInt());
            s.nextLine();

            //Strasse eingabe
            System.out.println("Strasse eingeben");
            neuePerson.setStreet(s.nextLine());

        }
        //hinzufügen von neueperson zu alleperson array
        allePersonen[anzahlPers] = neuePerson;
        anzahlPers++;
    }

    public static void allePersonen() {
        for (int x = 0; x < anzahlPers; x++) {
            System.out.println(allePersonen[x].getFirstName() + " " + allePersonen[x].getLastName());
        }
    }
}
    


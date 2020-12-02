package Main;

import java.util.Scanner;

public class Main {

    static Person[] hunters = new Person[10];
    static Scanner scan = new Scanner(System.in);
    static Scanner name = new Scanner(System.in);
    static int Personcounter = 0;
    static boolean quit = false;

static  void Titel(){
    System.out.println("");
}

    static void Info(){
        System.out.println("seinen sie gegrüssst");
    }



    public static void main(String[] args) throws InterruptedException {
        Tastenbelegung();
//clear screen
    }

    static void Tastenbelegung()

    {
        while(quit != true) {Info();
        int inputnumber = scan.nextInt();
        switch (inputnumber) {
            case 1:
               //estellt personen
                createPerson();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                quit = true;
                break;
        }
        }
    }

     static void createPerson () {
        System.out.println("bitte geben sie ihren vornamen an");
            Person a = new Person();
            a.setFirstName(name.nextLine());
         System.out.println(a.getFirstName() + " das ist ihr name");
    }

}

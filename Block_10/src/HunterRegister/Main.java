package HunterRegister;
import HunterRegister.Person;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Person[] hunters = new Person[15];

    static Scanner console = new Scanner(System.in);
    static int personCounter = 0;
    static int stupidcounter =0;
    static boolean quit = false;

    static  void Logo()throws InterruptedException {
    String b = "`````````````````````````            ``````````````````````````           ``````````````````````````\n" +
            "-ymmmmmmmmmmmmmmmmmmmmmmm`           dNNNNNNNNNNNNNNNNNNNNNNNNy           -mNNNNNNNNNNNNNNNNNNNNNmh:\n" +
            " `..----..--hMs-.......-.            --:mMMMMMMMMNNMMMMMMMMm:-.           `----------hMy----------` \n" +
            "            `yN+                      .dMMMMMMMMNhhNMMMMMMMMh`                     `yMs`            \n" +
            "             `oNs`                   -dMMMMMMMMmyyyhNMMMMMMMMd.                   .hNo`             \n" +
            "              `+Ny`                 -mMMMMMMMMmyyyyyhNMMMMMMMMd.                 .dN+`              \n" +
            "                /Nh`               :mMMMMMMMMmyyyyyyyymMMMMMMMMm-               -mN/                \n" +
            "                 :Nh.             /NMMMMMMMMdyyyyyyyyyymMMMMMMMMm:             -mN:                 \n" +
            "                  -mm-           /NMMMMMMMMdyyyyyyyyyyyymMMMMMMMMN:           /Nm-                  \n" +
            "                   -mm-         +NMMMMMMMMdyyyyyyyyyyyyyydMMMMMMMMN/         +Nd.                   \n" +
            "                    -dm:       +MMMMMMMMMdyyyyyyyyyyyyyyyydMMMMMMMMN+      `+Nd.                    \n" +
            "                     .dN/    `oNMMMMMMMNhyyyyyyyyyyyyyyyyyydMMMMMMMMN+`   `oMh`                     \n" +
            "                      .hN+` `sMMMMMMMMNhyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMs` `yMs`                      \n" +
            "                       `yNo`sMMMMMMMMNhyyyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMs.hMo`                       \n" +
            "                        `oMmMMMMMMMMNhyyyyyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMmN+`                        \n" +
            "                         .NMMMMMMMMNhyyyyyyyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMm.                         \n" +
            "                        -dMMMMMMMMmhyyyyyyyyyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMd.                        \n" +
            "                       -mMMMMMMMMmyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyhmMMMMMMMMd.                       \n" +
            "                      :mMMMMMMMMNyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyhNMMMMMMMMm-                      \n" +
            "                     :NMMMMMMMNmMdyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyydMmMMMMMMMMm-                     \n" +
            "                    /NMMMMMMMN/.dMdyyyyyyyyyyyyyyyyyyyyyyyyyyyyyydMh.oMMMMMMMMN:                    \n" +
            "                  `+NMMMMMMMm:  .hMdyyyyyyyyyyyyyyyyyyyyyyyyyyyymMy` `+NMMMMMMMN/                   \n" +
            "                 `oMMMMMMMMm-    `yMmyyyyyyyyyyyyyyyyyyyyyyyyyymMy`    /NMMMMMMMN+`                 \n" +
            "                `sMMMMMMMMd.      `sMmyyyyyyyyyyyyyyyyyyyyyyyhmMs`      :NMMMMMMMMo`                \n" +
            "               `yMMMMMMMMd.        `oMmhyyyyyyyyyyyyyyyyyyyyhNMo`        :mMMMMMMMMs`               \n" +
            "              `yMMMMMMMMh.           +NNhyyyyyyyyyyyyyyyyyyhNN+           -mMMMMMMMMs`              \n" +
            "             .hMMMMMMMMh.             /NNhyyyyyyyyyyyyyyyyhNN/             .dMMMMMMMMy`             \n" +
            "            .dMMMMMMMMy`               /NNhyyyyyyyyyyyyyyhNN:               .dMMMMMMMMh.            \n" +
            "           -mMMMMMMMMy`                 :mNhyyyyyyyyyyyydMm-                 .hMMMMMMMMd.           \n" +
            "          -mMMMMMMMMs`                   -mNdyyyyyyyyyydMm-                   `yMMMMMMMMd.          \n" +
            " .:::::::/mMMMMMMMMh:----`           .----/NMdhhhhhhhhdMN+::::.           `----:dMMMMMMMMm:-------` \n" +
            "/hmmmmmmmmmmmmmmmmmmmmmmm`           hmmmmmmmmmmmmmmmmmmmmmmmms           -mmmmmmmmmmmmmmmmmmmmmmmh:\n" +
            "`````````````````````````            ``````````````````````````            ````````````````````````` ";
        Boolean BlueWitheSwitch = true;
        for (int i = 0; i < b.length(); i++) {
            if(BlueWitheSwitch == true)
            {
            System.out.print("\u001B[37m"+b.charAt(i));
            BlueWitheSwitch = false;
            }
            else
            {
            System.out.print("\u001B[36m"+b.charAt(i));
            BlueWitheSwitch = true;
            }
            Thread.sleep(3);
        }
    }
   static void  Title() throws InterruptedException
   {
       System.out.print( "\u001B[33m \n Wilkommen bei der hunter Prüfung bitte tragen sie sich ein!");
   }
   static void Info()
   {
        System.out.println("\u001B[31m\n" +
                "geben sie eine zahle zwischen 1-5 ein \n"+
                "1 erstellt eine person \n"+
                "2 alle benutzer ausgeben \n" +
                "3 alle inhalte im array löschen \n"+
                "4 Das Program Beenden \n"+
                "5 Generate 5 legendary users" );
   }
    public static void main(String[] args ) throws IOException, InterruptedException
    {
        Logo();
        Title();
        Keybinding();
    }

    static void Keybinding()throws IOException, InterruptedException
    {
        while(quit != true)
        {
            Info();
            int inputnumber;
            while (true)
            {
                try
                {
                    inputnumber = Integer.parseInt(console.nextLine());
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("\u001B[31m" + "this is not a valued number for me try again");
                }
            }
            switch (inputnumber) {
                 case 1:
                    CreatePerson();
                 break;

                 case 2:
                     allUsers();
                 break;

                 case 3:
                     clearalldata();
                 break;

                case 4:
                    quit = true;
                    Endingfail();
                    System.out.println("Wir wünschen ihnen noch einen schönen tag!");
                break;

                case 5:
                    CreateInitialUsers();
                break;
            }
        }
    }

    static void CreateInitialUsers()
    {
        String[] firstname = new String[] {"Killua","Gon","Kurapika","Leorio","Hisoka"};
        String[] lastname = new String[] {"Zoldyck","Freecss","Kurta","Paradinight ","Morow"};
        int[] age = new int[] {15,15,19,21,22};
        String [] city = new String[] {"","Whale Island","Lukso Province","",""};
        int [] plz = new int[] {0,0,0,0,0};
        String [] street = new String[] {"","","","",""};

        if(personCounter >10)
        {
            System.out.println("To many existing users cannot add 5 more");
            return;
        }
        for (stupidcounter =0; stupidcounter < firstname.length; stupidcounter++)
        {
            hunters[stupidcounter +personCounter] = new Person(firstname[stupidcounter], lastname[stupidcounter], age[stupidcounter], city[stupidcounter], plz[stupidcounter], street[stupidcounter]);

        }
        personCounter+=firstname.length;
       // ich habe einen constructor in ihrer Klasse Person hinzugefügt das macht dann das aufrufen der variablen einfacher in der Methode
    }

    static void CreatePerson()
    {
         Person person = new Person();
         System.out.println("bitte geben sie ihren Vornamen an");
         person.setFirstName(console.nextLine());
         System.out.println("bitte geben sie ihren Nachname an");
         person.setLastName(console.nextLine());
         System.out.println("bitte geben sie ihr Alter an");
         while (true)
         {
             try
             {
                 person.setAge(Integer.parseInt(console.nextLine()));
                 break;
             }
             catch (Exception e)
             {
                 System.out.println("put your age in");
             }
         }
         if (person.getAge() >= 16) {
            System.out.println("bitte geben sie ihre Stadt an in der sie Wohnen");
            person.setCity(console.nextLine());
            System.out.println("bitte geben sie ihre PLZ an");
                while (true)
                {
                    try
                    {
                        person.setPLZ(Integer.parseInt(console.nextLine()));
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("\u001B[31m" + "Hunter müssen zählen können");
                    }
                }
            System.out.println("bitte geben sie ihre wohn strasse an");
            person.setStreet(console.nextLine());
         }
         System.out.println(person.getFirstName() + "Ihre Registration");
         hunters[personCounter] = person;
         personCounter++;


    }

    static void allUsers()
    {
       for (int i =0; i < personCounter; i++)
        {
            System.out.println(hunters[i].getFirstName() + " " + hunters[i].getLastName() + " " + hunters[i].getAge() + " "
                    +(hunters[i].getStreet()  == "" || hunters[i].getStreet()  == null ? "" : hunters[i].getStreet())
                    +(hunters[i].getPLZ() == 0 ? "" : hunters[i].getPLZ()) + " "
                    +(hunters[i].getCity() == null || hunters[i].getCity() == "" ? "" :  hunters[i].getCity()) + " "

            );
        }
        stupidcounter = 0;
    }
    static void clearalldata()
    {
        hunters =  new Person[hunters.length];
        personCounter = 0 ;
        stupidcounter = 0 ;
    }
    static void Endingfail()
    {
            if (quit == false)
            {
                System.out.println("Fuck this, this should never happens");
            }
    }
}
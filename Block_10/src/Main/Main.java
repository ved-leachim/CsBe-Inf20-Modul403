package Main;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Person[] hunters = new Person[15];

    static Scanner name = new Scanner(System.in);
    static int Personcounter = 0;
    static int i =0;
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
        Boolean Blackgreen = true;
        for (int i = 0; i < b.length(); i++) {
            if(Blackgreen == true)
            {
            System.out.print("\u001B[37m"+b.charAt(i));
            Blackgreen = false;
            }
            else
            {
            System.out.print("\u001B[36m"+b.charAt(i));
            Blackgreen = true;
            }
            Thread.sleep(3);
        }
    }
   static void  Title() throws InterruptedException
   {
       String c = "\n Wilkommen bei der hunter Prüfung bitte tragen sie sich ein!";
       for(int l = 0; l < c.length(); l++)
           {
            System.out.print("\u001B[33m" + c.charAt(l));
            Thread.sleep(220);
           }
   }


    static void Info()
    {
        System.out.println("\u001B[31m" + " \n gebn sie eine zahle zwischen 1-5 ein \n 1 erstellt eine person \n 2 alle benutzer ausgeben " +
        " \n 3 Clear screen in bearbeitung \n 4 alle inhalte im array löschen \n 5 Schliesst das Program" );
    }
    public static void main(String[] args ) throws IOException, InterruptedException
    {
        Logo();
        Title();
        Top5();
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
                    inputnumber = Integer.parseInt(name.nextLine());
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("\u001B[31m" + "this is not a valued number for me try again");
                }
            }
            switch (inputnumber) {
                 case 1:
                    createPerson();
                 break;

                 case 2:
                     allUsers();
                 break;

                 case 3:
                     clearalldata();
                     Top5();
                 break;

                case 4:
                quit = true;
                Endingfail();
                break;
            }
        }
    }
   /* static void Cls() throws IOException, InterruptedException {

        System.out.print("\033[H\033[2J");
        System.out.flush();  }
    */


    static void Top5()
    {
        Killua();
        Gon();
        Kurapika();
        Leorio();
        Hisoka();
    }
    static void Killua()
    {
        Person a = new Person();
        a.setFirstName("Killua");
        a.setLastName("Zoldyck");
        a.setAge(15);
        a.getFirstName();
        a.getLastName();
        a.getAge();
        hunters[Personcounter] = a;
        Personcounter++;
    }
    static void Gon()
    {
        Person a = new Person();
        a.setFirstName("Gon");
        a.setLastName("Freecss");
        a.setAge(15);
        a.setCity("Whale Island");
        a.getFirstName();
        a.getLastName();
        a.getAge();
        hunters[Personcounter] = a;
        Personcounter++;
    }
    static void Kurapika()
    {
        Person a = new Person();
        a.setFirstName("Kurapika");
        a.setLastName("Kurta");
        a.setAge(19);
        a.setCity("Lukso Province");
        a.getFirstName();
        a.getLastName();
        a.getAge();
        a.getCity();
        hunters[Personcounter] = a;
        Personcounter++;
    }
    static void Leorio()
    {
        Person a = new Person();
        a.setFirstName("Leorio");
        a.setLastName("Raradinight");
        a.setAge(21);
        a.getFirstName();
        a.getLastName();
        a.getAge();
        hunters[Personcounter] = a;
        Personcounter++;
    }
    static void Hisoka()
    {
        Person a = new Person();
        a.setFirstName("Hisoka");
        a.setLastName("Morow");
        a.setAge(22);
        a.getFirstName();
        a.getLastName();
        a.getAge();
        hunters[Personcounter] = a;
        Personcounter++;
    }
    static void createPerson ()
    {
         Person a = new Person();
         System.out.println("bitte geben sie ihren Vornamen an");
         a.setFirstName(name.nextLine());
         System.out.println("bitte geben sie ihren Nachname an");
         a.setLastName(name.nextLine());
         System.out.println("bitte geben sie ihr Alter an");
         while (true)
         {
             try
             {
                 a.setAge(Integer.parseInt(name.nextLine()));
                 break;
             }
             catch (Exception e)
             {
                 System.out.println("put your age in");
             }
         }
        if (a.getAge() > 16) {
            System.out.println("bitte geben sie ihre City an in der sie Wohnen");
            a.setCity(name.nextLine());
            System.out.println("bitte geben sie ihre PLZ an");
                while (true)
                {
                    try
                    {
                        a.setPLZ(Integer.parseInt(name.nextLine()));
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("\u001B[31m" + "Hunter müssen zählen können");
                    }
                }
            System.out.println("bitte geben sie ihre wohn strasse  an");
            a.setStreet(name.nextLine());
        }
        System.out.println(a.getFirstName() + "Ihre Registration");
        hunters[Personcounter] = a;
         Personcounter++;
         //Output();
    }
  /*  static void Output()
    {
        for(;i < Personcounter ; i++)
        {
            System.out.println(hunters[i].getFirstName() + " " + hunters[i].getLastName() + " " + hunters[i].getAge() + " " + hunters[i].getCity() + " " + hunters[i].getPLZ() + " " + hunters[i].getStreet());
        }
    }*/
        static void allUsers()
        {
        for (; i <Personcounter; i++)
            {
                System.out.println(hunters[i].getFirstName() + " " + hunters[i].getLastName() + " " + hunters[i].getAge() + " " + hunters[i].getCity() + " " + hunters[i].getPLZ() + " " + hunters[i].getStreet());
            }
            i = 0;
        }
    static void clearalldata()
    {
        hunters =  new Person[hunters.length];
        Personcounter = 0 ;
        i = 0 ;
    }
        static void Endingfail()
        {
            if (quit == false)
            {
                System.out.println("Fuck this, this should never happens");
            }
        }
}
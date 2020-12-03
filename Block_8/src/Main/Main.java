package Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Person[] hunters = new Person[10];

    static Scanner name = new Scanner(System.in);
    static int Personcounter;
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
    for (int i = 0; i < b.length(); i++) {
        System.out.print(b.charAt(i));
        Thread.sleep(3);}


}
   static void  Title() throws InterruptedException {
        String c = "\n seien sie bereit in der asdasdasd beitutrerten";
        for(int l = 0; l < c.length(); l++){
            System.out.print(c.charAt(l));
            Thread.sleep(220);}
    }


    static void Info(){

    System.out.println(" \n Klicken sie taste \n 1 \n 2 \n 3 \n 4 \n 5" );
    }





    static void Keybinding()

    {
        while(quit != true) {Info();
        int inputnumber = Integer.parseInt(name.nextLine());
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
         Person a = new Person();
        System.out.println("bitte geben sie ihren Vornamen an");
        a.setFirstName(name.nextLine());
         System.out.println("bitte geben sie ihren Nachname an");
         a.setLastName(name.nextLine());
         System.out.println("bitte geben sie ihr Alter an");
         a.setAge(Integer.parseInt(name.nextLine()));
        if (a.getAge() > 16){
         System.out.println("bitte geben sie ihre City an in der sie Wohnen");
         a.setCity(name.nextLine());
         System.out.println("bitte geben sie ihre PLZ an");
         a.setPLZ(Integer.parseInt(name.nextLine()));
         System.out.println("bitte geben sie ihre wohn strasse  an");
         a.setStreet(name.nextLine());}
        System.out.println(a.getFirstName() + " das ist ihr name");
        hunters[Personcounter] = a;
         Personcounter++;
         Output();

    }

    static void Output(){ for(int i = 0 ;i < Personcounter ; i++)
    {
        System.out.println(hunters[i].getFirstName() + " " + hunters[i].getLastName() + " " + hunters[i].getAge() + " " + hunters[i].getCity() + " " + hunters[i].getPLZ() + " " + hunters[i].getStreet());
    }
    }
    public static void main(String[] args) throws InterruptedException {
        Logo();
        Title();
        Keybinding();



    }
}

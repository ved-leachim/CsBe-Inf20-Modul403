package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person newPerson = new Person();
        String y[][] = new String[10][5];
        begrus();
        mainmenu(y);
    }
    static void mainmenu(String y[][]){
        Scanner scan = new Scanner(System.in);
        for (int i=1;i<2;) {
            int x = chose();
            if (x == 1) {
                reg(y);
            } else if (x == 2) {
                vivod(y);
            }else if (x==4){
                vivodd(y);
            }else if(x==3){
                delete(y);
            }else if(x==5){
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                System.out.println("Möchten Sie den Programm schliessen?\n\n" + "Ja - 1     Nein - 2");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                int ora = scan.nextInt();
                if(ora==1){
                    break;
                }
            }
        }
    }
    static void begrus(){
        System.out.println("-----------------------*");
        System.out.println("Guten Tag Herr Schmitz.");
        System.out.println("-----------------------*");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        System.out.printf("Wenn Sie wissen möchten, was dieses Programm tut - Drücken Sie die Taste 1 ein.\nWenn nicht, dann drücken Sie eine andere Zahl.\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        Scanner scan = new Scanner(System.in);
        int ora = scan.nextInt();
        for (int i=1; i<2;) {
            if (ora == 1) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                System.out.println("Das Programm sollte Ihnen die Möglichkeit bieten, Benutzer nacheinander hinzuzufügen und/oder aus der Anwendung zu entfernen.\nEs ist auch in der Lage, die persönlichen Informationen der registrierten Benutzer anzuzeigen.\nInsgesamt können nur 10 Personen angemeldet werden.");
                i+=1;
            } else if(ora>1 || ora<1){
                i+=1;
            }
        }
    }
    static int chose(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        System.out.printf("Registrierung       --> Drücken Sie die Taste 1\nBenutzer anschauen  --> Drücken Sie die Taste 2\nBenutzer entfernen  --> Drücken Sie die Taste 3\nBenutzer Infos      --> Drücken Sie die Taste 4\nSchlissen           --> Drücken Sie die Taste 5\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        int go= scan.nextInt();
        return go;
    }
    static String[][] reg(String tab[][]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            if (tab[i][0]==null){
                for(int j=0;j<=4;) {
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                    System.out.println("Name");
                    tab[i][j] = scan.nextLine();
                    j++;
                    System.out.println("Vorname");
                    tab[i][j] = scan.nextLine();
                    j++;
                    System.out.println("Alter");
                    tab[i][j] = scan.nextLine();
                    j++;
                    System.out.println("Strasse");
                    tab[i][j] = scan.nextLine();
                    j++;
                    System.out.println("PLZ");
                    tab[i][j] = scan.nextLine();
                    j++;
                }
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*\n");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                System.out.println("Was möchten Sie als nechstes tun?\n\n" + "Neue Benutzer einfügen - 1     Weiter gehen - 2");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
                int s = scan.nextInt();
                String t = scan.nextLine();
                if (s == 2) {
                    break;
                }
            }
        }
        return tab;
    }
    static void vivod(String tab[][]){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        for (int i=0;i<=9;i++){
            for (int j=0;j<=2;j++){
                if(j<2) {
                    System.out.print(' '+tab[i][j]);
                } else if (j==2){
                    System.out.printf(' '+tab[i][j]+"\n");
                }
            }
        }
    }
    static void vivodd(String tab[][]){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        for (int i=0;i<=9;i++){
            for (int j=0;j<=4;j++){
                if(j<4) {
                    System.out.print(' '+tab[i][j]);
                } else if (j==4){
                    System.out.printf(' '+tab[i][j]+"\n");
                }
            }
        }
    }
    static void delete (String tab[][]){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        System.out.println("Möchten Sie einen Benutzer entfernen?\n(Bitte überprufen Sie erst alle Benutzer)");
        System.out.println("Ja - 1   Nein - 2");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
        int gog= scan.nextInt();
        if(gog==1) {

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
            System.out.println("(Um einen bestimmten Benutzer zu entfernen, müssen Sie eine Taste von 1 bis 10 drücken.)\n ");
            System.out.println("Welchen Benutzer möchten Sie entfernen?");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------*");
            int go = scan.nextInt();
            go-=1;
            if (go <= 9 || go >= 0) {
                for (int j=0;j<=4;j++) {
                    tab[go][j]=null;
                }
            }
        }
    }
}
class Person{
}

package allPractices.practiceRecap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc haneli bir sayi giriniz");
        int sayi=scan.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler= sayi/100;

        //multiple declaration icin int birlerBas=sayi%10,onlarBas=(sayi/10)%10,yuzlerBas/100;

        if(sayi>99 && sayi<1000){
            switch (yuzler){
                case 0: System.out.println(""); break;
                case 1: System.out.println("yuz\t"); break;
                case 2: System.out.println("iki yuz\t"); break;
                case 3: System.out.println("uc yuz\t"); break;
                case 4: System.out.println("dort yuz\t"); break;
                case 5: System.out.println("bes yuz\t"); break;
                case 6: System.out.println("alti yuz\t"); break;
                case 7: System.out.println("yedi yuz\t"); break;
                case 8: System.out.println("sekiz yuz\t"); break;
                case 9: System.out.println("dokuz yuz\t"); break;
            }
            switch (onlar){
                case 0: System.out.println(""); break;
                case 1: System.out.println("on\t"); break;
                case 2: System.out.println("yirmi\t"); break;
                case 3: System.out.println("otuz\t"); break;
                case 4: System.out.println("kirk\t"); break;
                case 5: System.out.println("elli\t"); break;
                case 6: System.out.println("altmis\t"); break;
                case 7: System.out.println("yetmis\t"); break;
                case 8: System.out.println("seksen\t"); break;
                case 9: System.out.println("doksan\t"); break;
            }
            switch (birler){
                case 0: System.out.println(""); break;
                case 1: System.out.println("bir"); break;
                case 2: System.out.println("iki"); break;
                case 3: System.out.println("uc"); break;
                case 4: System.out.println("dort"); break;
                case 5: System.out.println("bes"); break;
                case 6: System.out.println("alti"); break;
                case 7: System.out.println("yedi"); break;
                case 8: System.out.println("sekiz"); break;
                case 9: System.out.println("dokuz"); break;
            }
        }else System.out.println("Uc basamakli sayi giriniz");


    }

}

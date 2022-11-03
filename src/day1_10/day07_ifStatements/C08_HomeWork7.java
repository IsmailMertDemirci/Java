package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork7 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir maas teklifi isteyin.
        teklif 80000 uzeri ise "Kabul ediyorum"
        60000-80000 arası ise "Konusabiliriz"
        60000 alti ise "Kabul edemem" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen maas teklifini giriniz");
        int maas=scan.nextInt();

        if (maas>80000){
            System.out.println("Kabul ediyorum");
        }else if(maas>60000 && maas<=80000){
            System.out.println("Konusabiliriz");
        }else{
            System.out.println("Kabul edemem");
        }

    }
}

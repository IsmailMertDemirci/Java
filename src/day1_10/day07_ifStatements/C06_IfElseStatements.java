package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullaniciya yasini sorun, eger 65 den kucuk ise "emekli olamazsin, calismalisin"
        65e esit veya buyukse "emekli olabilirsin" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("emekli olamazsin, calismalisin");
            // kac yil daha calismasi gerektigini de yazdirmak istersek
            //" emekli olamazsin, "+(65-yas)+" yil daha calismalisin ekleriz **
        }else{
            System.out.println("emekli olabilirsin");
        }
    }
}

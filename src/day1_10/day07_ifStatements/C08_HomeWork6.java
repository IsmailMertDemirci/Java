package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork6 {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden notunu isteyin. Notu harf sistemine cevirip yazdirin
        50 den kucukse "D", 50-60 arasi "C", 60-80 arasi "B", 80 in uzerinde ise "A"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not=scan.nextInt();

        if (0<not || not>100){
            if(not<50){
                System.out.println("Not:D");
            }else if(not<60){
                System.out.println("Not:C");
            }else if(not<80){
                System.out.println("Not:B");
            }else{
                System.out.println("Not:A");
            }
        }else{
            System.out.println("Not araligi yanlis");
        }
    }
}

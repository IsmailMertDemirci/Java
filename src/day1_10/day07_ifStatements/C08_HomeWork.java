package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork {
    public static void main(String[] args){
        /*
        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz");
        int kisaKenar=scan.nextInt();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");
        int uzunKenar=scan.nextInt();

        if (kisaKenar!=uzunKenar){
            System.out.println("sekil bir dikdortgendir");
        }else{
            System.out.println("sekil bir karedir");
        }

        /*
        Kullanicidan ucgenin kenar uzunluklarini isteyin ve 3 kenar da esit ise eskenar ucgen yazdirin,
        diger durumlarda eskenar ucgen degildir yazdirin
         */

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Ucgen eskenardir");
        }else{
            System.out.println("Ucgen eskenar degildir");
        }
    }
}

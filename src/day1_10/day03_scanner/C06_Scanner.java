package day1_10.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = Seyfi capar 34 seklinde yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");


        /*
        String verileri scanner ile alirken next() : ilk bosluga kadar olan kismi (1 kelime) alir
         ve nextline() : ise satirin sonuna kadar ne yazarsak alir
         NOT: eger art arda birden fazla string deger alacaksak nextLine() kullanmaliyiz
         */

        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);

    }
}

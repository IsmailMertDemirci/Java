package day1_10.day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {

    public static void main(String[] args) {
        //Kullanicidan ismini alip ilk harfini buyuk harf olarak yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /*
        Java Scanner class'inda nextChar() methodu yoktur, bunun yerine String olarak ilk kelimeyi alip
        onun da ilk harfini alabiliriz
         */
        char ilkHarf=scan.next().toUpperCase().charAt(0);

        System.out.println("Ismin ilk harfi : " + ilkHarf);

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Isminiz: "+isim+ "\nsoyisminiz :"+soyisim+ "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
    }
}

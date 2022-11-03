package day1_10.day03_scanner;

import java.util.Scanner;

public class C09_Scanner_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int sayi2 = scan.nextInt();

        System.out.println("Girilen sayilarin carpimi :"+sayi1*sayi2);
        System.out.println("Girilen sayilarin toplami :"+(sayi1 + sayi2));
        System.out.println("Girilen sayilarin farki :"+ (sayi1-sayi2));
        System.out.println("");

        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        double kenar = scan.nextDouble();
        double cevre = kenar*4;
        double alan = kenar*kenar;

        System.out.println("cevre ="+cevre);
        System.out.println("alan = "+alan);
        System.out.println("");

        System.out.println("Lutfen cemberin yaricapini giriniz");
        double r=scan.nextDouble();
        double cevre2=2*3.14*r;
        double alan2=3.14*r*r;
        System.out.println("Cemberin cevresi ="+cevre2);
        System.out.println("Cemberin alani ="+alan2);
        System.out.println("");


        System.out.println("Lutfen prizmanin uzun,kısa kenarlarini ve yuksekligini sırayla entere basarak giriniz");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double h=scan.nextDouble();
        double hacim=a*b*h;
        System.out.println("Prizmanin hacmi ="+hacim + " " +"metre kup");
        System.out.println("");


        System.out.println("Lutfen isminizi giriniz");
        scan.nextLine();
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        scan.nextLine();
        String soyisim=scan.nextLine();

        System.out.println("Isminiz: "+isim+ "\nsoyisminiz :"+soyisim+ "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");


        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String ad_soyad=scan.nextLine();
        System.out.println("Isim - Soyisim : "+ad_soyad);
        System.out.println("");


        System.out.println("Lutfen isminizi giriniz");
        char ilkharf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin bas harfi="+ilkharf);






    }
}

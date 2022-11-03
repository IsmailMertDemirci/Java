package day1_10.day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {

        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();   //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        //su anda sayi 5267, birler basamagi 0 rakamlar toplami 0

        birlerBasamagi=sayi % 10; //birler basamagi 7

        rakamlarToplami +=birlerBasamagi;
        sayi /= 10; //sayiyi 10a boler sayiya atar

        //su anda sayi 526 oldu, birler basamagi 7, rakamlar toplami 7

        birlerBasamagi= sayi % 10; // birler basamagi 6
        rakamlarToplami +=birlerBasamagi;

        sayi /=10;

        //su anda sayi 52, birler basamagi 6, rakamlar toplami 13

        birlerBasamagi= sayi % 10; //birler basamagi 2
        rakamlarToplami +=birlerBasamagi; //13+2=15

        sayi /=10;

        //su anda sayi 5, birler basamagi 2, rakamlar toplami 15

        birlerBasamagi=sayi % 10;
        rakamlarToplami +=birlerBasamagi; //15+5=20 oldu

        sayi /= 10; // sayi 5 di 10 a bolduk 0.5 oldu, integer oldugu icin 0 oldu

        //su anda sayi 0, bb 5, rt 20

        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami =" +rakamlarToplami);




    }
}

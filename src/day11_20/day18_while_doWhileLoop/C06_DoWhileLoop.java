package day11_20.day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
         Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
         “Negatif sayi giremezsiniz” yazdirip basa donun
         Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
         yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozitifSayiAdedi = 0;
        int negatifSayiAdedi = 0;
        int pozitifSayilarToplami = 0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozitifSayilarToplami += sayi;
                pozitifSayiAdedi++;
            } else if (sayi < 0) {
                negatifSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        } while (sayi != 0);

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari :" + pozitifSayilarToplami);
        System.out.println(negatifSayiAdedi + " adet negatif sayi girdiniz, onlar toplama dahil edilmedi");
    }
}

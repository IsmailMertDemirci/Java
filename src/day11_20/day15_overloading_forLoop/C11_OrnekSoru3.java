package day11_20.day15_overloading_forLoop;

import java.util.Scanner;

public class C11_OrnekSoru3 {
    public static void main(String[] args) {
        // Klavyeden tam sayı giriliyor.
        // Girilen sayı, Sıfır olmadığı sürece; Sizden tekrar sayı girmenizi istiyor.
        // Sıfır girildiğinde Sayı istemekten vazgeçiyor ve
        // Ekrana aşağıda istenenleri Yazdırıyor.
        // Kaç adet Negatif sayı Girildiğini;
        // Kaç adet Pozitif sayı Girildiğini;
        // Pozitif sayıların Toplamını;
        // Negatif sayıların Toplamını;
        // Örnek :  -1,2,-6,-4,-5,12,0 ==> 4 Adet Negatif  ; 2 adet Pozitif  ; Negatif Toplam :-16  ; Pozitif Toplam :14
        Scanner al = new Scanner(System.in);
        int pt, nt, pa, na, sayi, i;
        nt = 0;
        pt = 0;
        na = 0;
        pa = 0;
        sayi=10; // Geçici değer atadık..
        for (i = 1; !(sayi == 0); ++i) {
            System.out.print("Bir Sayı Girin: ");
            sayi = al.nextInt();
            if (sayi > 0) {
                ++pa;
                pt = pt + sayi;
            } else if (sayi < 0) {
                ++na;
                nt = nt + sayi;
            }
        }
        System.out.println(" Pozitif Sayı Adeti : " + pa);
        System.out.println(" Negatif Sayı Adeti : " + na);
        System.out.println(" Negatif Sayıların Toplamı : " + nt);
        System.out.println(" Pozitif Sayıların Toplamı : " + pt);
    }

}

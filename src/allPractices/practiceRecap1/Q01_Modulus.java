package allPractices.practiceRecap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     * int b1=(sayi/10000)%10;    // 1.basamak
      int b2=(sayi/1000)%10;    // 2.basamak
      int b4=(sayi/10)%10;     // 4.basamak
      int b5=(sayi)%10;       // 5.basamak
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num=scan.nextInt();

        int ilkIki=num/1000; //5 basamak oldugu icin 1000e bolunce ilk 2 rakam gelir
        int sonIki=num%100; //100e bolumunden kalani al yani son 2 rakam

        int ilkIkiToplam=(ilkIki/10)+(ilkIki%10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);
        int sonIkiToplam=(sonIki/10)+(sonIki%10);
        System.out.println("sonIkiToplam = " + sonIkiToplam);

        System.out.println("sayilarin toplami :"+(ilkIkiToplam+sonIkiToplam));

    }
}

package day1_10.day08_IfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan 4 basamakli bir sayi girmesini isteyin.
        Girdigi sayi 5’e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise ekrana “5’e bolunen cift sayi” yazdirin.
        Son rakami 0 degil ise “5’e bolunen tek sayi” yazdirin.
        Girdigi sayi 5’e bolunmuyorsa ekrana “Tekrar deneyin” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();//detaylar sayinin 5e bolunup bolunmemesi ve sayinin son basamaginin 0 olup olmamasi

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli bir sayi girin");
        } else if (sayi % 5 == 0) { //sayi 4 basamakli ve 5 e bolunebiliyor
            if(sayi%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }else{
            System.out.println("Tekrar deneyin");

        }

    }
}

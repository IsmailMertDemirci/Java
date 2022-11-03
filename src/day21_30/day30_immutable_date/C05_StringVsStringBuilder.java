package day21_30.day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuiler mi daha hizlidir?
        Bunun icin bir String olusturup 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki bulalim

        ayni sekilde StringBuilder ile de yapalim
         */

        LocalTime baslangic = LocalTime.now();
        String str = "Ahhhh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";
        }

        LocalTime bitis = LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : " + (bitis.getNano()- baslangic.getNano()));


    }
}

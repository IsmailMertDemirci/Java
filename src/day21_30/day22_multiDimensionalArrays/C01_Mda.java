package day21_30.day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    /*
    tek katli arraylerde arrayi direk yazdiramiyoruz, cunku array non primitive data turudur ve
     her non primitive data direk yazdirilamayabilir.
     Ancak arrayin icerisindeki elementleri direk yazdirabiliriz cunku genelde primitive data turu
     veya string elementler kullaniliyordu.

     Multi dimensional arraylerde en dikkat edecegimiz konu ulasmak istedigimiz elementin bir array mi
     yoksa primitive data mi oldugudur
     */
    public static void main(String[] args) {

        int [][] sayilar = {{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayini dusunursek icerisinde 2 tane inner array var,
        sayilar [0] ==> [1,2,4,5]

        ancak en icerideki elementlere ulasirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]); // referans yazdirir, yazdirmak istersek ArraysToString yapmaliyiz
        System.out.println(Arrays.toString(sayilar[0]));

        System.out.println(sayilar[0][1]);//2//outer arrayin 0.inner arrayinin 1. indexi{1,2,4,5} 1. index2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//2 adet referans verir
        System.out.println(Arrays.deepToString(sayilar));//[1,2,4,5],[3,4]

        /*
        Arrayi iki sekilde declare edebiliyorduk
        1- elemanlari direk yazarak int [][] sayilar = {{1,2,4,5},{3,4}};
        2-outer ve inner arraylerin uzunluklarini belirterek
        int[][] sayilar = new int [3][4];

        ancak ikinci yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer arrayin 3 tane inner arrayi vardir
        her bir inner arrayin ise 4 er elemani vardir

        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz mecburen 1. yontemi kullanmaliyiz

         */
    }

}

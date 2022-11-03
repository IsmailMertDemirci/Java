package day11_20.day20_arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        //iki sekilde Array olusturabiliriz

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar array'in uzunlugu : " + sayilar.length);//3
        //String length() methodunda parantez var arrayde yok, normalde isim.length() yazar ama arrayde () yok

        System.out.println("harfler array'in uzunlugu : " +harfler.length);//4
        System.out.println(Arrays.toString(harfler)); //[null,null,null,null]

        //harfler array'inin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]); // (harfler[harfler.length-1]) ifadesine dikkat et!

        System.out.println(harfler[5]);//uzunlugundan fazla olan indeksi sorarsak Java itiraz etmez,cunku
                                        //run time kisminda bakar, outOfBoundException hatasi verir
    }
}

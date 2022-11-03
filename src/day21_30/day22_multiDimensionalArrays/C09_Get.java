package day21_30.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_Get {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler = new ArrayList<>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");

        isimler.get(2);
        System.out.println(isimler.get(2));//Enes
        System.out.println(sayilar1.get(2));//2
        /*
        //bunlara generic methodlar denir, yani ben string bir liste icin calıstırdığımda
        stringe göre kendisini adapte ediyor ve calisiyor
        //integer bir liste yaptığımda oraya göre kendini düzenliyor ve bana integer donuyor.
         */
    }
}

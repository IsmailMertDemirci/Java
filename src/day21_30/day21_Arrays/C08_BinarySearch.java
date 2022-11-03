package day21_30.day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary Search Javada eleman aramanin kisa yoludur, ancak Binary Search'in calismasi icin once
        array'in sirali hale getirilmesi gerekir, eger siralama yapmadan binary search yaparsak sonucu
        bulamayabilir veya yanlis bulabilir
         */

        String [] harfler = {"Y","B","D","G","O"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler, arananHarf)); //y yi arayinca yanlis buldu d yi aradiginda dogru
                                                                      //cunku once sort yapmaliydik, olmazsa olmaz sart sort
        System.out.println(C03_ArraydeContainsOlusturma.contains(harfler, arananHarf));
        //binary search bize aradigimiz elemanin indeksini dondurur, cunku Arrays. yaptigimizda
        //ortaya cikan binary search uzantilarinin hepsi integer dondurur yani index

        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_ArraydeContainsOlusturma.contains(harfler, arananHarf));
    }
}

package day21_30.day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01         obj1    = new       C01();
       //class adi  obje adi  keyword   constructor

        Scanner scan =      new Scanner(System.in);
        Random rnd =        new Random();
        List<String> list = new ArrayList<>();

        /*
        JAvada bir obje olusturabilmek icin mutlaka constructor kullanmaliyiz
         */


        System.out.println(obj1.sayi); //default int degeri 0
        obj1.deneme();//souta koymama gerek yok, method void,direk yazar "C01 den deneme method"


    }
}

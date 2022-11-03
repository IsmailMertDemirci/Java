package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); //[10, 20, 30]

        //listedeki tum elementleri INDEX kullanmadan 3 arttirin

        for (Integer each : liste
        ) {
            System.out.print(each + 3 + " ");
        }
        System.out.println();
        System.out.println(liste);

        /*
        Java index yapisi olmayan collection'lardaki elementlere ulasmak veya degistirmek icin Iterator
        interface'ini olusturmustur

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir, bunun yerine bize Iterator
        donduren liste.iterator() methodunu kullaniyoruz
         */

        System.out.println(liste); //[10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next());//iterator objesi olustugunda listenin basinda bekler, next diyip yaninda
                                        // ne var diye sorarsak 10 yazdirir, 20 nin basina gelir
        System.out.println(it1.next());//20 yazdirir, yani 20 nin uzerinden atlar 30 un basina gelir, atladigi sayiyi yazar
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//30 dan sonra element kalmadigindan next()  RTE verir
        //iterator geri donmez surekli ileri gider, adim adim sona ulastiktan sonra basa gelmek
        //istersek yeniden bir Iterator olusturmamiz gerekir

        //[10, 20, 30]
        Iterator it2 = liste.iterator();
        //yeni it2 yi kullanarak listenin tum elementlerini silelim

        //it2.remove(); RTE verir cunku dizinin basinda ve bir elementin ustunden atlamadi, boslukta
        //silmek icin once bir elementin ustunden atlamali

        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); //[]
        //iterator ile elementleri gezip remove yapinca liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste :"+liste);
        Iterator it3 = liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("looptan sonra liste :"+liste);
        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
        1-tum collection elementlerini yazdirmak
        2-tum collection elementlerini silmek
        Bu da bize yetmez
         */
    }
}

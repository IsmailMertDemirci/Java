package day21_30.day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayCalisma {
    public static void main(String[] args) {

        //1)	Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");

        System.out.println(harfler);

        //2)	indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
        //        index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
        //        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.

        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler);

        //3)	set() methodu kullanarak, E’yi D yapiniz.
        //        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.


        harfler.set(harfler.indexOf("E"),"D");
        System.out.println(harfler);

        //4)	remove() methodu kullanarak, F’yi siliniz.
        //        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        harfler.add("F");
        System.out.println(harfler);
        harfler.remove("F");//buldugu ilk F i sildi, ikincisine dokunmuyor dikkat!
        System.out.println(harfler);
        harfler.remove("F");
        System.out.println(harfler);

        //5)	sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

        Collections.sort(harfler);//basit siralama icin harfler.sort degil Collections kullanilacak
        System.out.println(harfler);

        //6)	contains() methodu kullanarak, L’nin list’de var oldugunu
        // ve M'nin list’de var olmadigini dogrulayiniz.

        System.out.println(harfler.contains("L"));
        System.out.println(harfler.contains("M"));

        //7)	size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.

        System.out.println(harfler.size());//arrarin uzunlugu sabir, listin degisebilir

        //8)	clear() methodu kullanarak, list’deki tum elemanlari siliniz.

        //        9)	isEmptyO methodu kullanarak,
        //        list’deki turn elemanlarin silindigini dogrulayiniz

        System.out.println(harfler.isEmpty());//false
        harfler.clear();//icini sildik
        System.out.println(harfler.isEmpty());//true
        System.out.println(harfler.size());//0




    }
}

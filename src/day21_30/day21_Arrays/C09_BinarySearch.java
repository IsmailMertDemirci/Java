package day21_30.day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        binary search methodu siralanmis arrayde aradigimiz elementin indeksini dondurur
        ya aradigimiz element arrayde yoksa?
        (Stringde indexOf bize olmayan elementler icin -1 donduruyordu)

        Aradigimiz element arrayde yoksa Java hem olmadigini hem de olsaydi nerede olacagini
        bize dondurur, olmadigini ifade etmek icin - kullanir, olsaydi nerede olacagini
        belirtmek icin index degil siralama kullanir, 11 i arattigimizda eger 11 olsaydi
        index olarak 4 verirdi fakat olmadigi icin eger biz oldugunu var sayarsak 5. sirada
        olurdu dolayisiyla Java da -5 olarak gosterdi
         */

        int [] sayilar = {3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[0, 1, 3, 4, 5, 7]

        System.out.println(Arrays.binarySearch(sayilar,4)); //1

        System.out.println(Arrays.binarySearch(sayilar,15)); //4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1
    }
}

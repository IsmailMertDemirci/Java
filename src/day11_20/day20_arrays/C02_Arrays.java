package day11_20.day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar []=new int[3];
        System.out.println(sayilar);// {0,0,0} yazmadi, [I@19dfb72a yazdi cunku stack memorydeki referansi yolladi
        /*
        non primitive data turundeki datalari her zaman direk yazdiramayabiliriz
        Array'i yazdirmak istersek Javadaki Arrays classindan yardim isteriz
         */

        System.out.println(Arrays.toString(sayilar)); //[0,0,0] yazdirdi

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar); // yine yazmaz ram referansi gelir
        System.out.println(Arrays.toString(sayilar)); //[5,3,10] yazdirir indekse gore


        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="Hasan"; //sinifListteki 1. indeks Ayse idi, simdi biz 1. indekse Hasani atadik, artik Hasan yazar
        System.out.println(Arrays.toString(sinifList)); //[Ali, Hasan, Ahmet], isimler degisebilir ama length degismez

        System.out.println(sinifList[1]);  //sadece hasani yazdiralim, hasan tek basina bir string
        System.out.println(sinifList[0]); // Ali
    }
}



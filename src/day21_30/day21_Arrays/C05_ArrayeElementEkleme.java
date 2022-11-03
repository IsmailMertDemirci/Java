package day21_30.day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Verilen bir arraye yeni bir element ekleyen method olusturun

        String [] sinifListesi = {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String [] yeniSinifListesi = new String[sinifListesi.length+1];//+1 cunku yeni bir eleman eklenecek
        //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturduk
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //eski listedeki tum elemanlari yeni listeye tasidik
        yeniSinifListesi[yeniSinifListesi.length-1] = eklenecekIsim;
        //son indexe ise eklenecek ismi atadim
        return yeniSinifListesi;
    }
}

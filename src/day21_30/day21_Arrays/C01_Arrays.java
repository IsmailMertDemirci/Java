package day21_30.day21_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar = {10, 5, 7, 1, 4, 9, 5, 2};
        maxSayiyiYazdir(sayilar);
    }
    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];// 0. indeksi atadik, looptan once maks sayiyi koyacagim variable atamaliyim
        //arrayin 0.indexini atadik, kiyas yapacak

        for (int i = 1; i < sayilar.length; i++) { //0. elemani zaten maxSayi kisminda atadik ondan dolayi 1den basladi
            if (sayilar[i] > maxSayi) {
                maxSayi = sayilar[i];//sayilarin i indexindeki elementi maxsayidan buyukse, yeni max sayi bu sayinin i.
                //indexindeki sayi olsun
            }
        }
        System.out.println("Arraydaki en buyuk sayi : " + maxSayi);
    }
}

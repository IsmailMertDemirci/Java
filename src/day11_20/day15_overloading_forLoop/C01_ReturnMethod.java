package day11_20.day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
         /*
    Verilen iki sayiyi carpip sonucu bize donduren bir method olusturun
     */

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);//getirdigi degeri atamak icin sonuc variablesini olusturduk
        System.out.println("illa da sonucu goreyim diyenlere : "+sonuc);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1*sayi2;//istersek int sonuc=sayi1*sayi2 diyip return sonuc; diyebiliriz,illa formulu returne yazmaya gerek yok

    }

}

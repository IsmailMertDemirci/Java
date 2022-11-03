package day1_10.day05_MatematikselIslemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str="Java cok guzel";
        str.toUpperCase();//string non primitive oldugundan str dan sonra . koyunca bir suru method cikti

        int sayi=10;
        //primitive data turlerinin yaninda methodlar olmaz, java bazi methodlari kullanabilmemiz icin
        //her bir primitive data turu icin bir wrapper class olusturmustur

        Integer sayi2=10;
        sayi2.byteValue(); //Integer ile int karistirma Integer buyuk harfle yazildigi icin non primitive oldu
        //o yuzden sayi2 den sonra . koyunca bir suru method cikti, javanin olusturdugu bu methodlar wrapper class
    }
}

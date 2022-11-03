package day1_10.day05_MatematikselIslemler;

public class C01_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1; // sayi2 11 olur

        sayi2 +=5; // sayi2 16 olur

        /*
        pre veya post increment veya decrement sadece ++ ve -- islemi icin gecerlidir
        bu iki islem sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */

        int sayi3= sayi2++; // 1- sayi2 degeri sayi3 e atanacak
                            // 2- sayi2 bir arttiralacak

        /* ++ veya -- variableden sonra olursa buna postincrement denir
        bu durumda o satirda yapilan iki islemden artirma veya azaltma islemi sonra yapilir
         */

        System.out.println("sayi3 :"+sayi3);//16
        System.out.println("sayi2 :"+sayi2);//17

        int sayi4= ++sayi1; // 1- sayi1 bir arttiralacak
                            // 2- sayi1 degeri sayi4 e atanacak

        /*
        eger ++veya -- variableden once ise buna preincrement denir
        bu durumda o satirda yapilan iki islemden oncelikli olan artirma veya azaltmadir
         */

        System.out.println("sayi4 :"+sayi4);//11
        System.out.println("sayi1 :"+sayi1);//11
    }
}

package day31_40.day31_timeFormatter_varargs;

public class C03_varargsIleToplama {
    public static void main(String[] args) {
        //verilen kac sayida olursa olsun hepsini toplayip sonucu yazdiran method

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }

    public static void toplaYazdir(int... sayi){ //sayi kelimesinin ne oldugunun onemi yok, Passbyvalue ile degeri atar
    //... koyunca var args yapmis oluyoruz, cok degisken sayidaki argument demek
        // kac argument olursa olsun 3 nokta koydugumuzda itiraz etmeden islemi yapar

        /*
        int... sayi >> bu ifade integer variable'lardan olusan bir varargs demektir
        varargs Array alt yapisini kullanir, toplamak icin for each loop lazim
         */
        int toplam = 0;
        int sayiAdedi= sayi.length;
        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println("Girilen " +sayiAdedi+ " adet sayinin toplami :"+toplam);
    }
}

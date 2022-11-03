package day11_20.day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7);//ikinci kez topla yazdigimda 4 farkli method cikiyor
        topla(5.2, 3); //8.2
        topla(3.4,6.1);//9.5
        topla(5, 6.2);//casting yapti, int double methodu silindigi halde, int double kabina
        //sigacagi icin sonucu 11.2 cikardi, 3. methodu kullandi
        /*
        peki 5,7 topla methodunda neden 1. methodu kullandi? cunku en kisa surede en az isle
        sonuca ulasmak ister, eger 2. ve 3. methodlari kullanirsa 2. de 1 casting, 3. de 2
        casting yapacagi icin 1. methodda his castinge gerek kalmadan sonuca ulasir
        Dolayisiyla Java hangi methodun calisacagina karar verirken optimizasyon yapar
        -eger hic cast yapmadan kullanabilecegi method varsa onu kullanir
        -eger cast yapmadan kullanacagi method yoksa en az cast yaparak kullanabilecegi methodu
        tercih eder

        argument main kismindaki methodun icinde yazan kisim topla(3,5)
        parametre altta olusturdugumuz topla methodunun icinde yazilan sayilar
        topla(int sayi1, int sayi2) kismi
         */
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integerin toplami : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double bir integerin toplami : " + (sayi1 + sayi2));
    }


    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki doublenin toplami : " + (sayi1 + sayi2));
    }

}

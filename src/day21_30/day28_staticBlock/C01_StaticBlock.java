package day21_30.day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {//sadece bir kod blogu ve basinda static yaziyor
        /*
        Static blok class uyelerinin tamamindan once calisir
        (main methoddan bile once)

        static block class olusturuldugunda calisir genellikle de class ile ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir

         static block'larin class icerisinde nerede oldugu onemli degildir
         once static blocklar calisir

         Birden fazla static block varsa yukaridan asagiya dogru calisir
         arada baska bir method var mi main var mi bakmaz sirayla asagi dogru calisir
         */
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);//0

    }
    static {
        System.out.println("main method altindaki static block calisti");
    }
}

package day21_30.day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String

         */

        //Biz bir bankada calisiyor olalim, yildiz bank olsun. Bu yildiz bankin
        //bir suru subesi var ve biz de dolar satiyoruz, diyelimki dolarin degeri 17.40 olsun
        //Bankadaki memurlara soyle diyoruz, surekli musteri ise 10 kurus indirim yapma izni veriyorum.
        //A subesindeki kisi 10 kurus indirimle 17.30'a doviz aliyor, ayni anda b subesindeki biri a subesine bakip 17.20 uzerinden
        //satis yapsa, ... yildiz bank sizlere omur

        /*
        Bir seyde degisiklik yapacaksak kopya deger uzerinden yapmaliyiz, orjinel degerden degil.
        Yani musteri hep 17.40$ olarak gormeli.
        */

        String str = "Yildiz Bank";
        System.out.println(str.toUpperCase()); // YILDIZ BANK
        str.toLowerCase();
        System.out.println(str); // Yildiz Bank

        str.substring(3, 5); // sout olmadigindan yazdirmaz, di
        System.out.println(str); // Yildiz Bank
        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank
        sb.reverse();
        System.out.println(sb); // knaB avaJ
        sb.append(".");
        System.out.println(sb); // knaB avaJ.

        //Immutable class'lar degismiyor.
        //Mutable'lar degisiyor.

        //***String immutable***
        //***StringBuilder mutable***
    }
}
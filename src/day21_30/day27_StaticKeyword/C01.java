package day21_30.day27_StaticKeyword;

public class C01 {
    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        Class level'da iki tur variable olusturabiliriz
        static variable diger adi class variable
        instance variable diger adi obje variable
        static variable'lar tum class'tan kullanilabilirken instance variable'lar  sadece static olmayan
        methodlardan direk kullanilabilir.
        Instance variable'lara static methoddan ulasmak istersek obje olusturmaliyiz

        instance variableler obje variable'i oldugu icin herhangi bir satirda instance variable'in
        degerinin ne oldugunu bulmak icin obje olusturulan satirdan itibaren kod incelenmelidir

        static variable'lar class variable'i oldugu icin herhangi bir satirda static variable'in degerini
        bulmak icin class'in basindan itibaren kod incelenmelidir
         */

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri : "+obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : "+sayi);//10 obj yazmama gerek yok/sayi class variable

        //rakam+=1; rakam instance variabledir direk kullanilmaz
        obj1.rakam+=1; //dememiz gerekir
        sayi+=1;//diyebiliriz cunku static

        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : "+obj1.rakam);//6
        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : "+sayi);//11

        C01 obj2 = new C01();
        System.out.println("obj2'in rakam degeri : "+obj2.rakam); //5, rakam instance dolayisiyla objeye bagli, obj2
        //olustuktan sonra bir deger degismesi yoksa instance degeri neyse o gecerlidir bu yuzden 5, yukarida 6 olmasi
        //bizi ilgilendirmez fakat sayi icin oyle degildir
        System.out.println("obj2'in sayi degeri : "+obj2.sayi);//11 yazar cunku main icinde sayi degeri 1 kere artti

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : "+obj2.rakam);//6,obje olustuktan sonra
        //1 kere artti dolayisiyla 6 yazdirir
        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : "+obj2.sayi);//12, bastan itibaren 2kez artti
        //static variable oldugu icin sayinin son degeri icin class'in basindan son satira kadar sayi ile ilgili ne
        //yapilmissa kontrol etmeliyiz, bu satira kadar 2 kez arttigi icin sonuc 12 oldu
    }
}

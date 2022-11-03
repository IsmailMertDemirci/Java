package day11_20.day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10; //adini static verdim diye static olmaz, (static int staticSayi=10;) yazmaliyiz
    String isim="Mehmet";

    static int degerAtanmamisStaticVariable;
    int degerAtanmamisInstanceVariable;
    /*
    Class level'daki variablelere deger atamasak da Java kabul ediyor, bir sonraki classta kullanmak icin atadik
     */

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa objeler icin degil class icin gecerlidir
         */

        System.out.println(staticSayi);//10
        staticMethod(); //method cagrilmis, asagidaki methoda gidip 10 yazdirip doner ve iki satir alttaki 12 yi yazar
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();//burada static olmayan methoddan cagirmak icin obje yaptik
        obje1.staticOlmayanMethod();                        //yoksa static clube uye olmadigi icin gelmez

        System.out.println(staticSayi); //20 yazdirir fakat Run dedigimizde en altta cikar, sebebi ise bu sout
        //kodunun yukarida gorunmesine ragmen aslinda kod diziliminde en sonra yer almasidir, kodu adim adim takip
        //ettigimizde 20 yazan sout kodunun en altta oldugunu goruruz, cunku aralarda methodlara gittik geldik***

        /*
        instance bir variablenin degerini bulmak icin objenin olusturulmasindan itibaren istenen satira kadar
        kodu takip etmeliyiz
        Static Variable'de ise class'ın en basindan baslayarak istenen satira kadar kodu takip edip static
        variablenin son degerini bulmamiz gerekir
         */


    }

    public static void staticMethod(){

        System.out.println(staticSayi); //method cagrilmadigi muddetce calismaz, java main methoddan calismaya baslar
        //ve main method bittiginde durur, o yuzden yukarida staticMethodu cagirdik, burada sonucu 10 yazdirir,
        //cunku yukarida method cagrildiginda staticSayi degeri 10 du, daha sonra 12 atandi, kod atamadan once
        //cagrildigi icin 10 yazdirir

    }

    public void staticOlmayanMethod(){
        /*
        static variableler class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum methodlar static variableleri gorebilir ve degistirebilirler
        farkli methodlarda static variablenin hangi degeri alacagini bilmek istiyorsak class'ın basindan itibaren
        kodun calismasini takip etmeliyiz
        Method ne zaman cagirilirsa o anki static variable degerini methodda kullanabiliriz
         */
        System.out.println(staticSayi);
        staticSayi=20;//java itiraz etmez cunku Static sayilar oldugu icin her yerden kullanilabilir


    }
}

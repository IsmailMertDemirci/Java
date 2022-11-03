package day11_20.day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        farkli bir classta calisirken herhangi bir class adini yazip . ya basarsak adini yazdigimiz classtaki
        tum STATIC class uyelerini gorebilir ve kullanabiliriz
         */

        C02_StaticVariables.staticMethod();//10, bir onceki classtaki bu methoda gider, oradaki staticSayi variablesine
        //bakar o anda orada kac yazdirdiginin onemi yoktur, onemli olan staticSayi variablesinin en basta atanan degeridir, bu
        //sebeple C02 ye gidip Class Levele cikar ve oradaki staticSayi degeri 10 oldugu icin 10 yazdirir

        System.out.println(C02_StaticVariables.staticSayi);//10, sadece 2. classtaki staticSayi degerini istiyor

        System.out.println(C02_StaticVariables.degerAtanmamisStaticVariable);//?
        /*
        Class Level variablelere deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz, istemezsek deger atamayiz, keyfidir
        Eger deger atamissak Java atadigimiz o degeri kabul eder
        deger atamamzsak o zaman Java bu variablelere default bir deger atamasi yapar
        bu deger atamasi int yani sayisal degerler icin 0
        int -->0
        string icin --> null
        boolean icin --> false
        char icin --> '' hiclik, bos satir, string "" olarak degil char olarak hiclik ''
         */

        /*
        baska classdaki instance variablelere obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        // bu method icinde staticSayi20 oldu, yani bir daha kullanmak istersek 20 yazacak ama methodun icinden ilk basta
        //10 yazacak, cunku statikSayi degerinin ilk halini aliyor fakat sonra statikSayi 20 atamasi yapilmis,
        //, eger bir daha yazdirmak istersek bu sefer 20 yazdirir, asagida 42. satira bak
        System.out.println(obje1.isim); //Mehmet
        System.out.println(obje1.degerAtanmamisInstanceVariable); //int oldugu icin 0

        System.out.println(C02_StaticVariables.staticSayi);//20

        /*
        farkli bir classtan C02 classindan method ve variableleri kullandigimda C02 classinin tamami degil sadece benim
        cagirdigim class uyeleri calisir
         */
    }
}

package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1)  t->"Logic" , (t,u)->"Logic"
    Lambda Expression yapisi
    2)  Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez
    3)  "Method Reference" kullanimi "Class Name :: Method Name"
        Ayni zamanda kendi class'larinizi da kullanabilirsiniz
        Ornegin bir Animal class'iniz var ve bu class "eat()" methoduna sahip ise yazim sekli
        "Animal :: eat" seklinde method reference yapilir
     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKareToplami02(liste);
        tekrarsizCiftElemanlarinKareToplami03(liste);
        tekrarsizCiftElemanlarinKupleriniCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        terSiralamaylaTekrarsizElemanlarinYarisi(liste);
    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional ve method reference)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        //list.stream().forEach(System.out::print);//buraya bosluk ekleyemedigimiz icin method olusturacagiz bunun icin
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
        //methodu once string yapmistik CTE verdi cunku parametrem Integerdi, o yuzden methoddaki Stringi Object yaptim
        //Functional Programming dedigimiz olay bu, nasil yaptigina degil ne yaptigina odaklaniyoruz
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    //1. Yol
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam);

    }
    //2. Yol
    public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);

    }

    //3. Yol
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println(toplam);

    }

        //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void  tekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer> list){

        Integer carpim = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }

        //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Math::max).get();

        System.out.println(max);

    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

        //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer> list){

        Integer min =list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void terSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc = list.
                stream().//Gerekli methodları kullanmamızı sağlar
                        distinct().//Tekarlı olanları almaz
                        filter(t-> t>5).//Koşula göre filtreleme yapar
                        map(Utils::yarisiniAl).//Her bir elemanın değerini değiştirmeye yarar
                        sorted(Comparator.reverseOrder()).//Sıralama yapar
                        collect(Collectors.toList());//Elamanları collection'a çevirir.
        System.out.println(sonuc);

    }
}

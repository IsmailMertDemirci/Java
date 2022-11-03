package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1) Lambda Functional Programming Java 8 ile kullanilmaya baslanmistir.
    2) Functional Programming'de ne yapilacak(What to do) uzerine yogunlasilir, Structured Programming nasil yapilacak
    uzerine yogunlasir (How to do)
    3) Functional Programming Arrays ve Collections ile kullanilir
    4) "entry set() ile Map, Set'e donusturulerek Functional Programming'da kullanilabilir

     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);
        listElemanlariniYazdirStructured(list);
        System.out.println("");
        listElemanlariniYazdirFunctional(list);
        System.out.println();
        ciftElemanlariYazdirStructured(list);
        System.out.println();
        ciftElemanlariYazdirFunctional(list);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(list);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(list);
        System.out.println();
        tekrarsizCiftElemanlarinKareleriToplami(list);
        System.out.println();
        tekrarsizCiftElemanlarinKupleriCarpimi(list);
        getMaxEleman01(list);
        getMaxEleman02(list);
        getYedidenBuyukMinCift01(list);
        getYedidenBuyukCiftMin02(list);
        getYedidenBuyukCiftMin03(list);
        getTersSiralamaTekrarsizElemanlarinYarisi(list);



        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    }
    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list
        ) {
            System.out.print(w + " ");
        }
    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
        //stream() methodu collection"dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir


    }

    //2)Cift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)


    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //elemanlarin degeri degisecekse map methodu kullanilir( filter icinde t->t%2!=0 yazilabilir)
    }

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareleriToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);//bir ustte distinct filter map for each gibi calisiyor, o yuzden yok
        //reduce ici 0 t degeri, u degeri de t*t deki karenin sayisal degeri, ikisini toplayip 1 adet degere indirgedim
        //distinct tekrarli olan elemanlari eliyor, 3 tane 2 varsa 1 tanesini isleme aliyor, reduce tek sonuca indirgiyor
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupleriCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman01(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
        //Integer.Min yazmamizin sebebi o degerden daha kucuk bir sayi (-2milyar) olamayacagi icin, garanti cozum adina yaptik
        //ya da MINVALUE yerine list.get(0) yazip listin 1. elemanindan itibaren de kiyaslama yapabiliriz
        //(t,u)->t>u ? t : u) ternary yapisini kullandik, t buyukse t yi al degilse u yu
    }

    //2.yol
    public static void getMaxEleman02(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        //sorted yaptigimiz icin en buyuk deger natural order sebebiyle en sonda dolayisiyla u'yu ver dedik
        System.out.println("max = " + max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    //Integer min =liste.stream().distinct().reduce(liste.get(0),(t, u) -> t<u ? t : u);
    //Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
    //Integer min=sefer.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)-> t>u ? u : t);

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void getYedidenBuyukMinCift01(List<Integer> list) {
        //1.yol
        Integer minValue=list.stream().distinct()
                .filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("minValue = " + minValue);//reduce yerine min()dene
        //tek filterde dene filter(t->t%2==0 && t->t>7)
    }
    //2.yol
    public static void getYedidenBuyukCiftMin02(List<Integer> list){
        Integer minValue=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder())
                .reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("minValue = " + minValue);
    }

    //3.yol
    public static void getYedidenBuyukCiftMin03(List<Integer> list){
        Integer minValue=list.stream().distinct()
                .filter(t->t%2==0 && t>7).sorted().findFirst().get();//get demezsek findFirst calismaz
        //en buyugu bulmak istersem sorted(Comparator.reverseOrder()) yapar find first derim
        System.out.println("minValue = " + minValue);
        //Integer min = list.stream().distinct().filter(t->t%2==0).filter(t->t>7).min(Integer::compare).get()

    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini
    // (elamanın ikiye bölüm sonucunu) bulan ve bir list'e yazdiran bir method oluşturun.

    public static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0)
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc); //list'e atmak icin Collectors to list zorunlu, toList() de olur
        //degistirme yapiyorsam map gerekiyor yarisini istedigim icin degisecek dolayisiyla map
        //bolmelerde data kaybi riski varsa double yaparken .0 yazmaya dikkat et

    }
}



package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
    map.containsKey ==> verdigimiz key'in map'de olup olmadigini boolean olarak dondurur
    map.containsValue ==> bir butun olarak value'nun map'de olup olmadigini doner

    ONEMLI NOT: map.containsValue value'nun icindeki bir parcayi bulmada ise yaramaz
    value'nun icindeki butun degeri vermek gerekir sinifMap.put(101,"Ali, Can, JDev");
    Ali Can JDev in tamamini sormak gerekir

    Eger value icindeki bir parcayi aratmak istiyorsak map uzerinde manipulation yapmamiz lazim

    map.get(key) ==> verilen key'e ait degeri dondurur
     */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("Ali, Can"));//false

        //verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim

        //Map'lerde replace butun value'u degistirir ama biz bir parcasini degistirmek istiyoruz
        //o yuzden replace kullanamayiz, o zaman manipulation kullanmamiz lazim

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map'i guncelleme yapmak icin key yenidegeri map'e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifListMap.put(101, Ali, Can, Javadeveloper)

        //bunu yapabilmek icin her bir key'e ve ona ait value'ya ihtiyacim var

        //sinifListMap.keySet();//collection olusturup value'lara ulastigim gibi set ile keylere ulasirim
        Set<Integer> keySeti=sinifListMap.keySet();
        String yeniDeger;


        for (Integer each:keySeti
             ) {
            yeniDeger=sinifListMap.get(each);
            yeniDeger=yeniDeger.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,yeniDeger);
            /*
            biz key'lerin tamamini aldik, her bir key'in value'sunu get'irdik
            value uzerinde degisikligi yapip yeni halini put(key,yeniDeger) ile map'e koyduk
             */
        }
        System.out.println(sinifListMap);
    }

}

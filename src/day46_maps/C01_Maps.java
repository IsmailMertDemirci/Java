package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, QA");//Yazim sekli onemli, virgul ve bosluk konulacak
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, QA");
        sinifList.put(105,"Enes, Can, Tester");
        sinifList.put(106,"Taha, Deniz, JDev");
        sinifList.put(107,"Derya, Cem, Tester");

        System.out.println(sinifList);//{101=Ali, Can, JDev, 102=Enes, Cem, QA, 103=Taha, Emre, JDev, 104=Derya, Deniz, QA}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Enes, Cem, QA, Taha, Emre, JDev, Derya, Deniz, QA]
        System.out.println(sinifList.values().size());//7, kac tane veri bloku oldugunu gosterir

        //tum ogrencilerin isim ve soyisimlerini alt alta yazdirin

        Collection<String> tumValueCollection=sinifList.values();

        String [] eachArr;
        int sira=1;
        for (String each:tumValueCollection
             ) {
            //buradaki each bize her bir ogrenciye ait ayni yapidaki
            //isim, soyisim, brans bilgilerini iceren Stringler getiriyor
            eachArr=each.split(", ");
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
        }
        //Map'de bulunan ogrencilerin isim ve soyisimlerini birlestirerek
        //bir sinif listesi olusturun
        List<String> sinifIsimSoyisimList=new ArrayList<>();

        for (String each:tumValueCollection
             ) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);

    }

}

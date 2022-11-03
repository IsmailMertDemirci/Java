package day11_20.day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String karnNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3));//eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); //le

        //isim ve soyismin ilk harfi buyuk harf geriye kalan * olsun
        //kredi kartinin ilk 4 rakami gorunsun geriye kalani * olsun

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyIsimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=karnNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+"\n"+soyIsimIlkHarf
        +soyisimGeriyeKalanlar+" "+kkIlk4+kkGeriyeKalanlar);
    }
}

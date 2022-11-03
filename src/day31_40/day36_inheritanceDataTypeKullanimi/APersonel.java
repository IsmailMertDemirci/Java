package day31_40.day36_inheritanceDataTypeKullanimi;

public class APersonel {
    /*
    Child class'daki bir objenin child class ozelliklerini degil de parent class'a ait ozelliklerini
    vurgulamak istersek bu yonteme bas vururuz
    Eger parent class'da genel olarak belirlenmis bir ozellik, child class'da spesifiklestirilmis ise
    (override) daha guncel oldugu icin child class'taki gecerlidir
    Burada onemli nokta su, bir objenin ozelligini aramaya data turunden baslariz, orada bulamazsak
    kullanilmaz, bulursak daha gunceli var mi diye overriding aranir
     */

    String isim = "Isim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi";
    String departman = "Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personelimize sigorta yapilir");
    }
}

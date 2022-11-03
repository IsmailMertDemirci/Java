package day31_40.day34_Inheritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Javada use child classlar ozelliklerini inherit etmek istedikleri
    classi kendilerine parent edinirler(sabanciyi baba seciyor)
    Javada tercih hakki child classsin

     */

    /*
    mesela isci classini olsuturunca nelere ihtiyaci var diye dusunsek
    Personel classindaki tum variable ve methodlara ihtiyaci oldugunu gorebiliriz

    Bu durumda yeniden o variable ve methodlari olusturmak yerine Personel
    class'ini kendimize parent ediniriz

    Bir class'i parent edinmek icin " extends " keyword kullanmaliyiz
     */
    /*
    bir class baska bir classi parent edindiginde
    1-parent classtaki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2-parent classtaki ozelliklerden bazilarini kendine uyarlayabilir
    3-parent classta olmayan bazi ozellikler (variable || method) olusturabilir
    Not: parent classtaki ozelliklerden hicbirini reddedemez ama degistirebilir
     */

    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi

        isci1.isim="Selim";
        System.out.println(isci1.isim);//Selim

        System.out.println(isci1.persNo);//1001, kendi evimde seker varsa babamin evine gitmem

        isci1.maas();//Tum personelin maasi vardir/ altta maas methodu yapinca artik onu yazar, babaya gitmez

    }
    public void maas(){
        System.out.println("isciler min 15 euro saat ucreti alir");

    }
    public void ozelSigorta(){
        System.out.println("isciler isteyene %50 indirimli ozel sigorta yaptirilir");


    }

}

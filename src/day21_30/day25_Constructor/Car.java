package day21_30.day25_Constructor;

public class Car {
    /*
    bu Class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu class'ta belirleriz

    sonra farkli classlarda araba olusturmamiz gerekirse bu class'dan bir obje olusturup burada belirlenen
    variable ve methodlara gore araba uretiriz

    day25 car classindaki degerleri public yaptik gormesi icin
     */

    public String marka = "Marka belirtilmedi"; //marka belirtmezse bu yazi cikacak
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }
}

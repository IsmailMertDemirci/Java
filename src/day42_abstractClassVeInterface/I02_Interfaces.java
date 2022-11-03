package day42_abstractClassVeInterface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=30;
    String ISIM="Yildiz Koleji";
    /*
    Interface bir class degildir.

    Abstract class'lar javada abstraction (soyutlastirma/kural koyma) islevini yapiyordu
    ancak abstract bir class'ta abstract olmayan methodlar da olabilir
    bu da full abstraction yapmaya izin vermez
    Eger Java'da icinde hic concrete method olmasin dedigimiz bir class olusturmak istiyorsaniz bunu
    class degil interface yapmalisiniz

    1-INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2-Interface'ler full abstraction yaptigindan interface'lerden obje olusturulamaz

    Interface olan List'ten direk obje olusturamayiz
    List <String> liste = new List<>(); calismaz
    Bunun yerine constructor'i List'in child'i olan ArrayList'ten seceriz
    List <String> liste = new ArrayList<>();

    3-Class'larda bir child birden fazla parent edinemez
    Ancak Interface'lerde concrete method olmadigindan biz her methodu child class'ta override etmek zorundayiz
    Override ederken kimin soyledigini override ettigimizin onemi yoktur

    4- Interface'ler neyin yapilmasini gerektigini soyler ama nasil yapilacagina karismaz
     */

}

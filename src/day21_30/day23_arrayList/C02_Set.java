package day21_30.day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var
        Urun listesinde istenen siradaki urunu istedigimiz yeni urunle degistirip
        eski urunu var olan eski urunler listesine ekleyelim
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        //Listedeki Ikram'in yerine biskrem koyalim,
        //Ikram'i da eski urunler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        //urunler.set(temp,yeniUrun);
        String silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : " + urunler);
        System.out.println("eski urunler listesi : " + eskiUrunler);


    }
}

package day21_30.day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        arrayi array yapan sembol [] du
        arrayList de ise <> diamond kullanilir
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);// []

        //bir List'e eleman eklemek istersek
        isimler.add("Basak");//add methodu icine string ister sonuc olarak boolean dondurur yani true ya da false

        System.out.println(isimler.add("Ayse")); // true doner


        /*
        Stringde bir method calistirdigimizda assign yapmazsak String degismiyordu

        String isim = "Suleyman"
        isim.toUpperCase(); sadece bu satir icin SULEYMAN olur ama asagida(isim=isim.toUpper yapmak lazim degismesi icin)
        sout(isim) yazarsak Suleyman yazar cunku atama yok
         */
        System.out.println(isimler); //[Basak, Ayse]

        /*
        List'in tek kotu tarafi Array alt yapisini kullandigi icin elemanlari birer birer
        eklemek ZORUNDAYIZ
         */
    }
}

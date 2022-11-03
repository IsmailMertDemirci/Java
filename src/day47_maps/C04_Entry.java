package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map'in icerisinde bulunan her bir kaydi K=V seklinde tutar, dolayisiyla
        herhangi bir Entry'e ulastigimizda hem key'e hem de value'ya ulasabilir ve istedigimiz
        islemleri yapabiliriz

        entry.getKey() bize key'i getirir
        entry.getValue() bize value'u getirir
        entry.setValue() value'u istedigimiz deger olarak update eder
         */
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //map'in her bir elemanini alt alta yazdirin

        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            System.out.println(each);
        }

        //map'in tum elemanlarinda varsa  Tester kurs ismini QA olarak degistirelim
        String yeniDegerString;
        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            yeniDegerString = each.getValue();
            yeniDegerString = yeniDegerString.replace("Tester", "QA");
            each.setValue(yeniDegerString);
        }
        System.out.println(sinifListMap);
    }
}

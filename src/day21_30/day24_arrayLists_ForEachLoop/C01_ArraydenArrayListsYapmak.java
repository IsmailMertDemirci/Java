package day21_30.day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListsYapmak {
    public static void main(String[] args) {

        String[] arr={"Ismail", "Nurullah","Fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine array olusturup bunlari
        list'e cevirmek daha pratik olabilir
        bu cevirmeyi 2 sekilde yapiyorduk
        1-Loop ile arraydeki tum elementleri List'e atabiliriz
        2-Arrays.asList() kullanabiliriz
        Ancak bu methodun 2 tane negatif yonu var
        -Arrays class'i kullanildigi icin array ozellikleri gecerli olur
        dolayisiyla List'te olan add, remove gibi size'i degistiren methodlar
        bu sekilde olusturulan List'lerde kullanilamaz
        -Kaynak olan array ile urun olan List ozdeslestirilir
        birinde yapilan degisiklik otomatik olarak digerine de islenir
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); //[Ismail, Nurullah, Fatih]

        //1. negatif yani
        //sinifList.add("Erdi");//unsupportedOperationException hatasi

        //sinifList.remove(1);//unsupportedOperationException hatasi

        arr[1] ="Emre";// arrayı degıstırınce lıst de degıstı (diger kotu yani)
        System.out.println("degisim sonrasi array : " +Arrays.toString(arr));
        System.out.println("arrayi degistirince list : "+sinifList);

        sinifList.set(0,"Utku");//list degisince array de degisti
        System.out.println("List'i degistirince List : "+ sinifList);
        System.out.println("List'i degistirince Array : "+Arrays.toString(arr));
    }
}

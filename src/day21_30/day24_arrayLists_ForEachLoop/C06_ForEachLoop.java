package day21_30.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari iceleyelim, tek sayi olanlari list'e atayalim
        for (int each: arr  // gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
        ) {
            if (each%2==1){//ındex varsa kullanılamaz ama array ve lısttekı tum elemanları getır
                liste.add(each);//dersek kullanabiliriz
            }
        }
        System.out.println(liste);
    }
}

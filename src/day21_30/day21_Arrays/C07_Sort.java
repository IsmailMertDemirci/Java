package day21_30.day21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int [] sayilar = {5,7,1,6,4,3,9};

        //Arrayi "Arrays Class" ini kullanarak natural(sayi ise kucukten buyuge
        //harf ise..) sirali hale getirebiliriz

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }
}

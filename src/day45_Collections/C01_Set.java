package day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir array'deki tekrar eden elementleri silip tekrarsiz halini arraye atayan bir kod yaziniz

        int [] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each: arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet);

        int [] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i =0;//25. ve  30. satirlar arasinda for each loopu indeksli hale getirdik, normalde indexsiz
        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }

        arr=tekrarsizArr;
        System.out.println("bizim array'in son hali : "+Arrays.toString(arr));

    }
}

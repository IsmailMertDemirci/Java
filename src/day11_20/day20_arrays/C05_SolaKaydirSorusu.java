package day11_20.day20_arrays;

import java.util.Arrays;

public class C05_SolaKaydirSorusu {
    public static void main(String[] args) {
        /*
        Verilen 3 elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak bir program yaziniz
        Ornek; array [1,2,3] ise output [2,3,1] olacak
         */

        int arr[]={1,2,3,4,5}; //indeksi 1 olani indeksi 0 olana atamamiz lazim

        int temp=arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {

            arr[i]=arr[i+1];//i 0 degerini aldiginda i1 i i0 a atayacak, bu sekilde devam edecek

        }
        //System.out.println(Arrays.toString(arr)); //[2,3,3] olur, once atama yapalim sonra yazdiralim
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 1]

        //yukarida degistirdigimiz arrayi ilk durumuna getirmek icin bu sefer saga kaydiralim,
        //bu sefer en sondaki 1 elementini yedekleyelim

        temp=arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {

            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]



    }

}

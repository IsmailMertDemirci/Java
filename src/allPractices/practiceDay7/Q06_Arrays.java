package allPractices.practiceDay7;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {
           FarkiniBul();

       }

    private static void FarkiniBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();
        int [] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array'in " +(i+1)+". elemanini giriniz :");//i oldugunda direk 0. eleman diyecek
                                                                            //biz index degil direk eleman sorduk
            arr[i]=scanner.nextInt();//fori den gelen indexler, bu satirda kullanici tarafindan
                                    //dongu bitene kadar girilen elemanlar okunur
        }

        Arrays.sort(arr);
        System.out.println("Dizideki EB EK arasindaki fark : "+(arr[uzunluk-1]-arr[0]));

        /*
        int buyukSayi=arr[0];
        int kucukSayi=arr[0];
        for (int i = 1; i < arr.length ; i++) {
         if (arr[i]>buyukSayi){
        buyukSayi=arr[i];

        }else if (arr[i]<kucukSayi){
        kucukSayi=arr[i];
    }
}
         */

    }

}

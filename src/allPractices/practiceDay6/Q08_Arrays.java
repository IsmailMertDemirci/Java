package allPractices.practiceDay6;

import java.util.Scanner;

public class Q08_Arrays {
    /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int count=0;
        for (int i = 0; i < arr.length; i++) {//i=1 yazarsak i<=arr.length yazmamiz gerekir
            System.out.println(i+".indexteki sayiyi giriniz :");
            arr[i] = scan.nextInt();

            if (arr[i]%3==0){
                count++;
            }
        }
        System.out.println("3'e bolunebilen sayi :" + count);
    }
}

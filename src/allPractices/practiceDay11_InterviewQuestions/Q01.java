package allPractices.practiceDay11_InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = scan.nextLine();

        String[] arr = str.split("");//arraye cevirmek icin kullandim
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {//1 den baslattik 0. indeks 1 e esit mi diye baktik
               counter++;
            }else{
                System.out.println(arr[i-1]+" sayisi"+(counter+1));//=1 eklemenin sebebi indeksleri yanyana kiyasladigi icin
                //3 aaa olsa 3. a yi sonraki b ile kiyaslayince onceki 2 a yi yaziyor fakat 3, a yi yazdirmiyor
                counter=0;
            }if ((i==arr.length-1)){//bu sekilde arrayin son elemanini almadigi icin yeni if ekledim
                System.out.println(arr[i-1]+" sayisi"+(counter+1));
            }

        }
    }
}

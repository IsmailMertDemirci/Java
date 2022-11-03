package allPractices.practiceday13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        0-1-1-2-3-5-8-13-21-34....
        */
        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i = 1;

        if (sayi <= 1) {
            System.out.println("Daha buyuk sayilar gir");
        } else {
            while (fibonacciList.get(i) < sayi) {//fibonacci elemanlari sayidan kucuk oldugu muddetce
                fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i - 1));//bir onceki elemani yanindaki eleman ile toplar
                i++;
            }
            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiEleman = fibonacciList.size() - 1;
        if (fibonacciList.get(sonIndextekiEleman) > sayi) {
            fibonacciList.remove(sonIndextekiEleman);//burasi son elmani kaldiriir
            System.out.println("girdigin sayi fibonacci dizisinde bulunmamaktadir = " +
                    "sizin girdiginiz sayiya kadar ki fibonmacci dizisi budur " + fibonacciList);
        } else {
            System.out.println("senin girdigin sayi fibonacci listinde var fibonacciList = " + fibonacciList);
        }
    }
}


package day11_20.day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    /*
    Interviev question
    Kullanicidan 100’den kucuk bir tamsayi isteyin,
    1’den başlayarak girilen sayiya kadar tum sayilari yazdirin.
    Ancak;
-	Şayi 3’un kati ise sayi yerine “Java” yazdirin.
-	Şayi 5’in kati ise şayi yerine “Güzeldir” yazdirin.
-	Şayi hem 3’un hem 5’in kati ise şayi yerine “Java Güzeldir” yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            if(i%3==0 && i%5==0){ //okekten dolayi i%15==0 da diyebiliriz tek satirda
                System.out.print("Java Guzeldir"+"\n");
            }else if(i%5==0){
                System.out.print("Guzeldir"+" ");
            }else if(i%3==0){
                System.out.print("Java"+" ");
            }else{
                System.out.print(i+ " ");
            }

        }
    }
}

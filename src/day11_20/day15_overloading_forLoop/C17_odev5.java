package day11_20.day15_overloading_forLoop;

import java.util.Scanner;

public class C17_odev5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 100'den küçük bir tamsayı giriniz: ");
        int sayi=scan.nextInt();
        for(int i=1;i<=sayi;i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }

    }
}

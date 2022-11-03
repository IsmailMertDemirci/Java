package day11_20.day15_overloading_forLoop;

import java.util.Scanner;

public class C16_odev4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 100'den küçük bir tamsayı giriniz: ");
        int sayi=scan.nextInt();
        int i;

        for(i=1;i<=sayi;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}

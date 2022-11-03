package day1_10.day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    /*
    Kullanicidan notunu isteyin, notu harf sistemine cevirip yazdirin, 50den kucukse D,50-60 arasi C
    60-70 arasi B, 80 ve uzeri A, gecersiz not girince uyari versin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not giriniz");
        double note=scan.nextDouble();

        if(note<0 || note>100){ // and ile yapmak istersen ! ile yaparsin (!(note>=0&&note<=100))
            System.out.println("Gecerli bir not giriniz");
        }else if(note<50){
            System.out.println("Notunuz: D");
        }else if(note<60){
            System.out.println("Notunuz: C");
        }else if(note<80){
            System.out.println("Notunuz: B");
        }else{
            System.out.println("Notunuz: A");
        }
    }
}

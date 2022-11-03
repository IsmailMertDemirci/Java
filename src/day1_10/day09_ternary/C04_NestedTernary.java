package day1_10.day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin kucuk harf ise
        consola “Kucuk Harf" , buyuk harfse consola "Buyuk Harf” yoksa
        "girdiginiz karakter harf degil” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ((harf>='A' && harf<='Z') ? "Buyuk Harf" : "Gecersiz Karakter");//parantezsiz de calisir

        System.out.println(sonuc);
    }
}

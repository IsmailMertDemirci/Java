package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yazi giriniz");
        char harf=scan.nextLine().toLowerCase().charAt(0);

        if (harf>='a' && harf<='z'){
            System.out.println("Girdiginiz ilk karakter harftir");
        }else if(harf>='0' && harf<='9' ){
            System.out.println("Girdiginiz ilk karakter rakamdir");
        }else{
            System.out.println("Girdiginiz ilk karakter harf ya da rakam degildir");
        }

    }
}

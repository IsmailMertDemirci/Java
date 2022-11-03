package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork5 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
         */
        //ascii ile yaptik

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yazi giriniz");
        char harf=scan.nextLine().toLowerCase().charAt(0);

        if (harf>=97 && harf<=122){
            System.out.println("Girdiginiz ilk karakter harftir");
        }else if(harf>=48 && harf<=57 ){
            System.out.println("Girdiginiz ilk karakter rakamdir");
        }else{
            System.out.println("Girdiginiz ilk karakter harf ya da rakam degildir");
        }

    }
}

package day11_20.day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    /*
        Kullanicidan email adresini isteyin
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        @gmail.com ile bitmiyorsa "Gecerli mail adresi giriniz"
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresi giriniz");
        String email=scan.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lutfen gecerli mail adresi giriniz");
        }
    }
}



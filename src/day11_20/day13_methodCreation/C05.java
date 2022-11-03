package day11_20.day13_methodCreation;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir şifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Şifre basari ile tanimlandi”,
        sartlari sağlamazsa “İşlem basarisiz,Lütfen yeni bir şifre girin” yazdirin
        -	İlk harf buyuk harf olmali
        -	Son harf kucuk harf olmali
        -	Şifre bosluk içermemeli
        -	Şifre uzunluğu en az 8 karakter olmali
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();

        boolean ilkHarf=(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z');

        if(ilkHarf){
            System.out.println("ilk harf buyuk");
        }else{
            System.out.println("ilk harf buyuk degil");

        }
    }
}

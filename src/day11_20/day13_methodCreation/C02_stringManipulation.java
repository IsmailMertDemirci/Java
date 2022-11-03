package day11_20.day13_methodCreation;

import java.util.Scanner;

public class C02_stringManipulation {
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
        int kontrol=0;
        //ilk harf kontrolu
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("Ilk harf buyuk olmali");
        }
        //son harf kontrolu
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harf kucuk olmali");
        }
        // bosluk kontrolu

        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else{
            kontrol++;
        }
        //sifre uzunluk kontrolu
        if(sifre.length()>=8){
            kontrol++;
        }else{
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if(kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("islem basarisiz, lutfen yeni bir sifre giriniz");
        }

    }
}

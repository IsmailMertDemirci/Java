package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C08_HomeWork2 {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
                isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
                gecerli degilse “Gecerli gun ismi giriniz” yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi giriniz");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba") ||
                girilenGun.equals("persembe") ||girilenGun.equals("cuma") ||girilenGun.equals("cumartesi") ||
                girilenGun.equals("pazar") ){
            System.out.println(""+girilenGun.toUpperCase().charAt(0)+girilenGun.charAt(1)+girilenGun.charAt(2));

        }else{
            System.out.println("Gecerli bir gun giriniz");
        }

    }
}

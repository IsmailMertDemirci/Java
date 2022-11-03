package day1_10.day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun:Pazar output="Hafta sonu"
               gun:Sali  output="Hafta ici"

         String icin equals methodunu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        // String girilenGun=scan.next();
        // kullanicidan gun ismi istedik fakat kullanici Pazar mi, pazar mi, PAZAR mi hangisini yazacak?
        //o yüzden hepsini kucuk harfe cevirmesi icin kod ekledik

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gun HAFTASONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("Girilen gun HAFTAICI");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }
    }
}

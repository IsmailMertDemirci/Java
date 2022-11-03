package day1_10.day08_IfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismi isteyin, girilen gun ismi gecerli bir gun ise gun isminin ilk uc harfinin
        birincisi buyuk diger ikisi kucuk yazdirin, kalani kucuk harf olsun, gun ismi gecerli degilse
        "Gecerli bir gun ismi giriniz" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi") ||gun.equals("pazar")){
            System.out.println("Paz");
        }else if(gun.equals("sali")){
            System.out.println("Sal");
        }else if(gun.equals("carsamba")){
            System.out.println("Car");
        }else if(gun.equals("persembe")){
            System.out.println("Per");
        }else if(gun.equals("cuma") || gun.equals("cumartesi")){
            System.out.println("Cum");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz");
        }

    }
}

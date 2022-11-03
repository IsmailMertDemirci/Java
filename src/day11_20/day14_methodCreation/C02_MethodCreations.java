package day11_20.day14_methodCreation;

import day11_20.day13_methodCreation.C04_methodCreation;

public class C02_MethodCreations {
    /*
    public static void rakamlariTopla(int input) {
    System.out.println(input/100+input%10+(input/10)%10);
}
    Verilen 3 basamakli bir sayinin rakamlari toplamini yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        int input=521;

        rakamlaritopla(input);
        C04_methodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");
    }

    public static void rakamlaritopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz "+temp+" sayisinin rakamlar toplami : "+rakamlarToplami);

    }
}

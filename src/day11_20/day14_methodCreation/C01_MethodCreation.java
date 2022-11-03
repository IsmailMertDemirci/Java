package day11_20.day14_methodCreation;

import day11_20.day13_methodCreation.C04_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir Stringi tersten yazdiran bir method olusturalim

        terstenYazdir("okan");
        C04_methodCreation.topla(6,5); //bir method olusturdugumuzda farkli classlardaki
        //bilgileri de cekebiliriz, bir onceki C04 den toplamayi cektik

    }
    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi :"+tersInput);
    }
}

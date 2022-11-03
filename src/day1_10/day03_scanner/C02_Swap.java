package day1_10.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /* verilen sayi1 ve sayi2 variablelerinin degerlerini degistiren (swap) bir program yaziniz
        orn : sayi1=15 ve sayi2=20; kod calistiktan sonra
        sayi1=20 ve sayi2=10 olmali
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        //sayi 3 gecici kova
        //adim 1 sayi 2 yi bos kovaya koyalim

        sayi3 = sayi2; //sayi 1 degismedi 10, sayi2 20 , sayi3 20 oldu

        // adim 2 , sayi1 i sayi2 ye atayacagiz
        sayi2 = sayi1; // sayi1 10 du duruyor, sayi2 de 10 oldu, sayi3 20

        // adim 3, bos kovadaki sayiyi sayi1 e atayalim
        sayi1 = sayi3; //sayi1 20 oldu, sayi2 10 da kaldi, sayi3 20

        System.out.println("swaptan sonra sayi1 :" + sayi1); //20
        System.out.println("swaptan sonra sayi2 :" + sayi2); //10
    }
}

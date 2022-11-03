package day1_10.day05_MatematikselIslemler;

public class C02_PreVePostIncrement {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("preincrement :" +  ++sayi); //once arttir sonra yazdir 11



        System.out.println("postincrement :" + sayi++); //once yazdir sonra arttir 11


        System.out.println("post-increment'den sonra: " + sayi); //12
    }
}

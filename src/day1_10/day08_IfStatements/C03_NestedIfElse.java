package day1_10.day08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    /*
    emeklilik kontrolu yapan bir program yaziniz, cinsiyet olarak E erkek veya K kadin degiskenlerini
    kabul etsin, farkli bir sembol girilirse hata mesaji versin
    emeklilik icin kadinlarda yas siniri 60, erkeklerde 65 olsun
    negatif yas veya 80 den buyuk yas girilirse hata mesaji versin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz"+"\nKadin icin K erkek icin E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'){
            if(yas<0 || yas>80){
                System.out.println("Gecerli yas giriniz");
            }else if(yas<65){
                System.out.println("Emekli olamazsin");
            }else{
                System.out.println("Emekli olabilirsin");
            }
        }else if (cinsiyet=='K'){
            if(yas<0 || yas>80){
                System.out.println("Gecerli yas giriniz");
            }else if(yas<60){
                System.out.println("Emekli olamazsin");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        }else{
            System.out.println("Lutfen gecerli bir tercih giriniz");
        }


    }


}

package day1_10.day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println((sayi1/sayi2)); //ikisi de int oldugundan sonucu int olarak kabul edip yazdirir, 4.6 değil 4

        System.out.println(25*7/3); // 58 yazar kusurat gider

        double sayi3=5;
        System.out.println(sayi1/sayi3); // 4.6 yazdirir cunku iki variablenin data turu degisik oldugunda
                                         // daha kapsamli olani data turu olarak kabul eder, double daha kapsamli intten


    }
}

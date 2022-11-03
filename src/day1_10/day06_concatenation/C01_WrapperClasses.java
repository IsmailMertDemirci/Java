package day1_10.day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper class javanin hazir kodlari kullanabilmemiz icin primitive data turlerinin her biri
        icin actigi classlardir.
        int in wrapperi Integer
        char--> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String str="Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL yazdirir

        boolean guzelMi=true;
        //guzelMi yazdirir, boolean primitive oldugundan hazir methodu bulunmuyor, fakat bunu B si buyuk yani
        //non pritive hale getirirsek o zaman wrapper class cikiyor

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); //32797 shortun S sini büyük yazınca wrapper class oluştu
        // dolayisiyla ben shortun min ve max degerlerini ezberlemeden bulabildim, diger primitiveler icin
        //de gecerli

        String ogrNo="123456";
        //kullanicidan bir sifre isteyin
        //eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifre:" + sifre); //12500 girsek ve yanına +3 eklesek 125003 yazar
        System.out.println("Integer sifre: "+ sifreSayi);//12500 girsek ve yanına +3 eklesek 12503 olur, ikisinin
        //arasındaki fark bu

        /*
        Wrapper class'lar ileride kullanacagimiz pek cok faaydali hazir method icerir
         */


    }
}

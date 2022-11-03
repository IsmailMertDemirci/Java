package day21_30.day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        //bir obje olusturacağımız zaman hep new methodunu kullanacağız demistik
        //bazen de new ile olusturuamayız ama bunun yerine bir method ile olusturabiliriz
        //burada now methodu var ve bize bir tarih döner.
        //yani biz yeni bir objeyi sol tararfta olusturuyoruz, sağ tarafta değer ataması yapıyoruz, ama bazen bu değer atamasını java class larda new keyword ile olustururken
        //bazen de bir class üzerinden farklı bir method ile olusturabilirsiniz.

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear());//artik yil mi, is ile baslayanlar boolean dondurur

        LocalDate tarih2=LocalDate.of(1986,7,10);
        System.out.println(tarih2);

        LocalDate tarih3= LocalDate.of(1986, Month.JULY,10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));//100 gun sonra hangi tarih?

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2027-11-04

        System.out.println(tarih.minusWeeks(20));//2022-03-05

        System.out.println(tarih.minusDays(100).minusMonths(5));//2021-11-14

        System.out.println(tarih.isAfter(tarih2));// tarih tarih 2  den once mi sonra mi

        //iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz

        //tarih 2 ve tarih 3 icin yapalim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+"tarihinde dogan daha buyuk");
        }else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2+"tarihinde dogan daha buyuk");
        }else{
            System.out.println("iki tarih birbiri ile ayni");
        }

    }
}

package day21_30.day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:12:46.805414700

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now() kullandigimiz satirda o anki tarih veya saati alip bizim
        variable'imiza store eder. time1 variable'inin degeri sabittir
        asagida 3 saniye beklet dememize ragmen ayni sonuc cikiyor o yuzden
        */

        Thread.sleep(3000); // kodumuzu bekletir, 3 saniye girdik

        System.out.println(time1);//

        Thread.sleep(3000);

        time1=LocalTime.now();// simdi degisir sonuc
        System.out.println(time1);

        System.out.println(time1.plusSeconds(10000));//saniye sonra saat kac?

        System.out.println(time1.minusMinutes(200));//dk once saat kac?

        System.out.println(time1.withHour(3));//saat 18 di 3 yaparak yaz diyor, dakika saniye ayni kalacak


    }
}

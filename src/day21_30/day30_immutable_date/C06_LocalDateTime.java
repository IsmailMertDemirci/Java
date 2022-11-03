package day21_30.day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);//2022-07-23T19:40:18.849814100

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(100).minusMinutes(100));

        System.out.println(tarihSaat.minusDays(100).plusHours(100));

        System.out.println(tarihSaat.toLocalDate());


    }
}

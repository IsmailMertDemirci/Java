package day21_30.day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        /*
        iki tarih arasindaki sureyi bulma
         */

        LocalDate tarih1=LocalDate.of(1986,7,10);
        LocalDate bugun=LocalDate.now();

        Period period =Period.between(bugun,tarih1);

        System.out.println(period);//P-36Y-13D


    }
}

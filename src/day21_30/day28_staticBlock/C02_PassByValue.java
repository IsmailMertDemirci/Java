package day21_30.day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); //90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati)); //90
        /*
        iki farkli methodda satis fiyati isminde variable olabilir, Java buna itiraz etmez
        cunku Scope'lari farklidir
         */

    }

    public static double indirimliFiyat(double orjinalFiyat){
        //methodumuz %10 indirim yapip yeni fiyati main methoda dondursun

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}

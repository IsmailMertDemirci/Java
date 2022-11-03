package day1_10.day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        /*
        normalde ingilizce karakter oldugunda buyuk harfle yazarsak
        BENI PSIKOPATA BAGLAMAYIN yazar, locale.forlanguageTag("tr") yazdigimizda ise
        BENİ PSİKOPATA BAGLAMAYİN yazar, bu kalip dillere gore yazim seklinde bir
        degisiklik varsa onu yapiyor, I love you yazisini seni seviyorum yazmiyor

        EGER BUYUK KUCUK HARF DONUSUMUNDE LOCAL BIR DILI ESAS ALMAK ISTERSENIZ
        BU METHOD KULLANILABILIR
         */

    }
}

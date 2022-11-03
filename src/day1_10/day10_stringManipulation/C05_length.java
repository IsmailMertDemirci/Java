package day1_10.day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length()); //str nin karakter sayisini verir

        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));

        /*
        Java'da null pointer bir deger degil, karsisina yazildigi variable'in hicbir deger
        almadiginin isaretcisidir
         */

        String str2="";//str 2 ye bir deger atanmis midir EVET, bu deger nedir:hiclik(space)
        System.out.println(str2.length());

        String str3=null; //str3 e bir deger atanmis midir HAYIR
                          //null bu deger atamamayi isaret ediyor

        System.out.println(str3.length()); //bir deger atanmamis ki uzunlugu olsun?
                                           //null pointer exception hatasi verir

    }
}

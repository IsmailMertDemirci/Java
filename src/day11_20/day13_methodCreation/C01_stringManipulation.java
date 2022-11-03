package day11_20.day13_methodCreation;

public class C01_stringManipulation {
    public static void main(String[] args) {
        /*
        String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        String strl = “$13.99”
        String str2 = "$10.55"
        ipucu : Double.parseDoubleO methodunu kullanabilirsiniz.

         */

        String str1="$13.99";
        String str2="10.55";

        str1=str1.replaceAll("\\D","");
        double sayi1=Double.parseDouble(str1);

        str2=str2.replaceAll("\\D","");
        double sayi2=Double.parseDouble(str2);

        System.out.println("$"+(sayi1+sayi2)/100);

        System.out.println(str1+ "" +str2);
    }
}

package day1_10.day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can" + "";
        String str4="Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //normalde false vermesi gerekirdi true verdi
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1.equals(str4));//true

        System.out.println(str1==str5); // normalde true vermesi gerekirdi false verdi
        System.out.println(str1.equals(str5)); //true
        System.out.println(str3.equals(str5)); //true
        System.out.println(str3==str5);//false

        /*
        Stringlerdeki ayni String olsa bile == her zaman dogru calismaz
        emin olmak icin equals() kullanmaliyiz
        equals() kullandigimizda dikkat edecegimiz tek sey metinlerin bire bir ayni
        olmasidir
         */



    }
}

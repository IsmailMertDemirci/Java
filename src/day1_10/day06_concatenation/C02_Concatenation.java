package day1_10.day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

        //yukaridaki variableleri kullanarak istenen metinleri yazdiralim

        //Java Guzeldir 54
        System.out.println(str1+" "+str2+" "+sayi1+sayi2); //neden en sağda 5+4 değil de 54 yazdi, cunku basta
        //string var dolayısıyla intler stringe donustu

        //Java Guzeldir 9
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));

        //9 Java
        System.out.println(sayi1+sayi2+" "+str1);

        //54 Guzeldir
        System.out.println(sayi1+(sayi2+" ")+str2);  //(""+sayi1+sayi2+" "+str2) seklinde de yazilabilir

        System.out.println(str1.concat(str2));; //JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir



    }
}

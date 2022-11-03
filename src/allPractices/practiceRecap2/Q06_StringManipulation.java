package allPractices.practiceRecap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
    // method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
    // ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("string1 :");
        String str1=scan.nextLine();

        System.out.println("string2 :");
        String str2=scan.nextLine();

        System.out.println("1. yontem :"+str1+" "+str2);
        System.out.println("2. yontem :"+str1.concat(" "+str2));

        //System.out.println(str1.substring(1)+ " " +str2.substring(1)); yapsak olur, alttaki fazladan
        String str1IlkHarfSonrasi=str1.substring(1);
        String str2IlkHarfSonrasi=str2.substring(1);

        System.out.println("manipulationdan sonraki hali :"+str1IlkHarfSonrasi
        +""+str2IlkHarfSonrasi);
    }
}

package allPractices.practiceDay3;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve
    // hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz :\nisim");
        String isim=scan.next();

        System.out.println("soyisim");
        String soyisim=scan.next();

        if(isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        }else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle esit uzunlukta");
        }else System.out.println("soyisminiz isminizden uzun");
    }
}

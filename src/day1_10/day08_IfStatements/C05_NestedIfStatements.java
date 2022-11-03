package day1_10.day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfStatements {
    public static void main(String[] args) {
        /*
        Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        Ilk harf A ise "Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
        Ilk harf z ise "Gecerli Sifre” degilse "Gecersiz Sifre” yazdirin.
         */
        //Ilk harf buyuk mu kucuk mu, ilk harf A mi z mi?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        char ilkharf=sifre.charAt(0);

        if(ilkharf>='A' && ilkharf<='Z'){
            if(ilkharf=='A'){
                System.out.println("Gecerli Sifre");
            }else{
                System.out.println("Gecersiz sifre");
            }

        }else if(ilkharf>='a' && ilkharf<='z'){
            if(ilkharf=='z'){
                System.out.println("Gecerli sifre");
            }else{
                System.out.println("Gecersiz sifre");
            }

        }else{
            System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
        }


    }
}

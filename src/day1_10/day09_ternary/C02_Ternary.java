package day1_10.day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan birsayi alin. Sayi pozitifse "Sayi pozitif” yazdirin, negatifse sayinin karesini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        //eger ternary icindeki sonuclar farkli data turlerinde ise
        //atama yapamayiz, sadece yazdirabiliriz

        //double ya da string ile atama yapip yazdirmayi denedigimizde
        //double sonuc= sayi>0 ? "sayi pozitif" : (sayi*sayi) yaparsak "sayi pozitif" kismi hata verir
        //string sonuc= sayi>0 ? "sayi pozitif" : (sayi*sayi) yaparsak "(sayi*sayi) kismi hata verir
        //Bu yüzden sadece yazdiriyoruz

        System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));
    }
}

package day11_20.day15_overloading_forLoop;

import java.util.Scanner;

public class C12_OrnekSoru4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi Girin :");
        String cumle= scan.nextLine();
        System.out.print("Aratmak İstediğiniz Harf veya Kelimeyi Girin :");
        String kelime= scan.nextLine();
        int kelimeuzun=kelime.length();
        int cumleuzun=cumle.length();
        int toplam = 0;
        for (int i = 0; i <=cumleuzun - kelimeuzun; ++i) {
            String kes = cumle.substring(i, i+kelimeuzun);
            System.out.print(kes + "  ");
            if (kes.equals(kelime)) toplam += 1;
        }
        System.out.println();
        System.out.println(kelime + " Cümlede  " + toplam +" adet vardır");
    }
}

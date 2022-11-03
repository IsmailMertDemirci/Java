package allPractices.practiceRecap1;

import java.util.Scanner;

public class Q03_BMI {
    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kg olarak agirliginizi giriniz");
        double kilo=scan.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy=scan.nextDouble();
        boy=boy/100; //cm olarak girin dedigimiz icin bu assign'ı yaptık boy/=100 yazabiliriz

        double vki=kilo/(boy*boy);
        System.out.println("vki = " + vki);



    }
}

package day31_40.day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu var sayalim
        Kullaniciya index sorup , o indeksteki urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesin
         */
        String [] urunler = {"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan ;

        int istenenSira=0;
        boolean control=true;
        while (control) {
            try {
                scan = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira no'sunu giriniz");
                istenenSira = scan.nextInt();
                control=false;
            } catch (InputMismatchException deneme) {

                //deneme.printStackTrace(); dersek hatayi gosterir
                //System.out.println("hata mesaji : "+deneme.getMessage());
                System.out.println("Urun indexi icin bir sayi girmeniz gerekir");//kullanici elma derse mesela
            }
        }
        /*
        catch blogunun onundeki parantezde exception class'inin ismi ve yaninda yakalanan
        exception'i atadigimiz variable'in ismi olur(e) bu e yakalanan exception'i uzerinde tasiyor
        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa e kullanilmasa da kod calisir
        yani e yerine deneme de yazsam silsem de calisir
         */
        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor"+"\nSira numarasi " +
                    "en fazla : "+(urunler.length)+" olabilir");
        }

        /*
        1. TRY KISMI: yapilmak istenen islem.
        2. Yakalanmasi istenen EXCEPTION turu ve yakalaninca icine konacak obje.
        3. CATCH BLOGU: problem yakalandigindan ne yapilacagi belirtilen bolum.
        */
    }
}

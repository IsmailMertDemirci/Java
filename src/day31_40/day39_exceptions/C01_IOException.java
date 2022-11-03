package day31_40.day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz
         */

        FileInputStream fis = new FileInputStream("src/day31_40.day39_exceptions/Test.txt");

        /*
        Goruldugu gibi Compile Time'da altini kirmizi cizen her durum Compile Time Error degildir
        Java'da bazi exception'larda Compile Time Exception'dir
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar Compile Time Exception'dir

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try - catch ile cevrelemek
        2- method signature'ina throws keyword ile beklenen Exception turunu eklemek

        throws Exception sadece olayin farkinda oldugumuzun declarasyonudur
        Exception'in handle edilmesinde hicbir rolu yoktur
        Yani try - catch ile kontrol altina aldigimiz exception'larda kod calismaya devam ediyordu
        ancak throws exception yazdigimizda bir exception ile karsilasirsa hicbir sey yapmamisiz gibi hata mesaji
        yayinlayip calismayi durdurur
         */
    }
}

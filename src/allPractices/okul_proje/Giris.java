package allPractices.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    public static void main(String[] args) {
        /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
        System.out.println("Okulumuza Hosgeldiniz");

        System.out.println("isim giriniz");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("bransinizi girini");
        String brans = scan.next();

        scan.nextLine();//dummy hayalet kod, alt alta bazen scannextleri birlikte aliyor
        //bunun olmamasi icin araya dummy atiyoruz

        System.out.println("telefonunuzu giriniz");
        String tel = scan.next();



        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);

        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }
}

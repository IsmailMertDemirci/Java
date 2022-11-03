package day21_30.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturmaRANDOMile {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000 den kucuk pozitif tam sayi olan bir list olusturun
        kullanicidan bir sayi isteyip listede var olup olmadigini kullaniciya yazin
         */

        //Scanner gibi calisan Random classi var

        Random rnd = new Random(); //0 ile 1 arasinda sayi uretir, bound methodunu
        //secersek belirledigimiz bound sayisina gore random sayi atar -->Random
        int sayi=0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);//0-1000 arasi sayi uretecek, sonra ben bunlari ne yapacagim?
            if (!sayiListesi.contains(sayi)){//listemde yoksa ekleyecegim varsa eklemeyecegim, bunun icin if ve !
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);
        //bulana kadar sayi girecegiz bu sebeple asagidaki islemleri yaptik

        boolean bildiMi = false;
        int tahminSayisi=1;
        Scanner scan =new Scanner(System.in);

        while(!bildiMi){//bildiMi false oldugu muddetce calismali
            // fakat while icinde false olursa calismaz, o yuzden basina ! koyduk

            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " +tahminSayisi+" adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;//donguden cikmasi icin boyle atamaliyim, burasi true olunca while ici false olacagi icin loop duracak
            }else {
                System.out.println(tahminSayisi+" adet sayi girdiniz ama hicbiri listede yok");
                tahminSayisi++;//kac tahminde bulundugunu bilmek icin sayac gibi belirledik
            }
        }

    }
}

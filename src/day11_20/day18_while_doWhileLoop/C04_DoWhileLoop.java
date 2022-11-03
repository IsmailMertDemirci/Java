package day11_20.day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan tam sayilar alin, kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan=new Scanner(System.in);//loopun icinde variable olusturulmaz, hem ram dolar hem de loop icinde
                                            //olusturulan variable loop disinda kullanilamaz
        int sayi=0;

        //while ile yapalim
        /*
        looplarda kullanacagimiz variableleri looptan once olusturmaliyiz
        while loopta loopdan once olusturdugumuz bu variableye atayacagimiz degeri iyi dusunmemiz gerekiyor cunku
        yanlis deger atarsak loop hic devreye girmez
         */

        while (sayi%2==0){

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else{
                System.out.println("girilen sayi tek");
            }

        }

        //do while ile yapalim, whileda sayi=0 tanimlamistik donguden once, do whilede bunun hicbir onemi yok
        //dongu direk calisacak,
        //do whileda ilk calistirma kontrol yapilmadan oldugu icin loop bodysinde yanlis islem olmamali

        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else{
                System.out.println("girilen sayi tek");
            }

        }while(sayi%2==0);
    }
}

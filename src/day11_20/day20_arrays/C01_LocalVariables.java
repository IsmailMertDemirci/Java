package day11_20.day20_arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi=10;
        //System.out.println(sayiMethod); sayiMethod method1 de olusturulmus local variabledir

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);

        }

        //System.out.println(i); i loopda olusturulmus local variabledir, sadece loop icerisinde kullanilabilir

        //static int sayiStatic=20; static yazamayiz cunku static kelimesi Class levelde kullanilabilir
        //methodlarin icerisinde static variable TANIMLANAMAZ
    }


    public static void method1(){
        //System.out.println(sayi); sayi main methodda olusturulmus local bir variabledir ve sadece
        //main methodda gecerlidir

        int sayiMethod=20;
    }
}

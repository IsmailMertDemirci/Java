package day11_20.day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5, 7);//ikinci kez topla yazdigimda 4 farkli method cikiyor
        topla(5.2, 3); //8.2
        topla(3.4,6.1);//9.5

    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integerin toplami : " + (sayi1 + sayi2));
    }

    /*
    bir class ta parametre sayisi ve parametre turleri ayni olan 2 method OLUSTURAMAYİZ

    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki integerin toplami : " + (sayi1+sayi2)); aynisini yazinca
        kabul etmedi, sayi3 ve sayi 4 desem de kabul etmez, cunku ikisi de integer
     */
    public static void topla(double sayi1, int sayi2) {
        System.out.println("Iki integerin toplami : " + (sayi1 + sayi2));
    }


    public static void topla(int sayi1, double sayi2) {
        System.out.println("Bir int ve bir double toplami : " + (sayi1 + sayi2));
    }
    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double toplami : " + (sayi1 + sayi2));
    }
    //ayni isimle 4 farkli method olustu, topla methodu ile, ikinci kez topla yazdigimda
    //4 farkli method cikacak topla yazisinin yaninda
}



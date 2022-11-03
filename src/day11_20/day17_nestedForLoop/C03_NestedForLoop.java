package day11_20.day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen yükseklik ve uzunluk degerine gore * lardan olusan bir dikdortgen olusturun
        yükseklik :3, uzunluk:4
         */

        int yukseklik=3;
        int uzunluk=4;

        for (int i = 1; i <=yukseklik; i++) {
            for (int j = 1; j <=uzunluk ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}

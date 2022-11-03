package day21_30.day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        //verilen bir multi dimensional arrayin tum elementlerini yazdiran bir method yapin

        int [][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);
    }

    private static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { //i=0,1,2 degerlerini alacak
            for (int j = 0; j <sayilar[i].length ; j++) {//3 inner arrayin uzunluklari farkli, ondan dolayi [i].length yaptik
                System.out.print(sayilar[i][j]+ " ");

            }
        }
    }
}

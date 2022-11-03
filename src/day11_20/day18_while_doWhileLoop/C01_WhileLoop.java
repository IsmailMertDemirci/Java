package day11_20.day18_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf='c';
        char sonHarf='u';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase(); //"" eklemeseydik olmazdi, string strong yaptik, chari stringe cevirdik
            System.out.print(buyult+" ");     //daha sonra da char toUpperCase olamayacagi icin stringden sonra toUp yaptik
            temp+=1;
        }
    }
}

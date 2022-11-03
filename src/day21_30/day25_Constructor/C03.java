package day21_30.day25_Constructor;

public class C03 {
    /*
    Proje olustururken bazi classlar run etmek icin degil variable ve method olusturup bunlari
    baska classlardan kullanmak icin olusturulur
     */

    /*
    Default Consturctor parametresizdir, goremesek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz herhangi bir Constructor olusturursak Java
    Defaul cons'u yok eder
     */

    C03(){

    }

    /*
    olusturdugumuz parametresiz bu Constructor Default Cons ile birebir aynidir fakat aynisi degildir
    biz default consun islevini yerine getiren parametresiz cons yazdik, default cons gorunmeyen constur
     */
    String isim = "Etka";

    public void method01(){
        System.out.println("C03 method calisti");
    }
}

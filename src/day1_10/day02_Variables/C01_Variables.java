package day1_10.day02_Variables;

public class C01_Variables {

    public static void main(String[] args) {
        int               not             =             60                  ;
        //data turu  variable ismi   assignment sign    variable değeri   işlem bitti işareti

        int  not2          =70;
        //variable          değer
        //java önce değeri hesaplar sonra assign işlemini yapar

        //not2'yi 80 yapalim

        not2=90;

        //yeni bir int variable olusturalim degeri ilk 2 variablenin ortalamasi olsun

        int ort = (not + not2) /2;

        System.out.println(ort);
        // "" icinde yazilan her sey metindir, Java "" icinde ne gorurse aynen yazdirir
        // eger bir variablenin degerini yazdirmak istiyorsaniz
        // "" olmadan variable ismini yazmaliyiz
    }
}

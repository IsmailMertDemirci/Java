package day31_40.day35_inheritanceConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    her classta gorunmese bile bir constructor vardir
    Bu class'tan obje olusturmak istedigimizde default constructor
    devreye girecektir

    Default Constructor'i gozlemleyemeyecegimiz icin onun yerine
    kullanilabilecek parametresiz constructor olusturalim
     */

    protected String grandpaKlupAdi="Grandpa Klubu";

    AGrandParent (){
        System.out.println("Grandpa constructor calisti");
    }


}

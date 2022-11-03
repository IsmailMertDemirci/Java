package day31_40.day35_inheritanceConstructorKullanimi;

public class LOgretmen {

    LOgretmen(){

        System.out.println("LOgretmen parametresiz cons");
    }
    LOgretmen(String isim){

        this();
        System.out.println("LOgretmen parametreli Cons");
    }
}

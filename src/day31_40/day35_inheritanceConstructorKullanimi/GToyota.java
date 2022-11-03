package day31_40.day35_inheritanceConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("Toyota parametresiz cons");
    }
    GToyota(String isim){
        //super(isim); extends olmadigi icin super cons call kabul etmez
        System.out.println("Toyota parametreli cons");
    }
}

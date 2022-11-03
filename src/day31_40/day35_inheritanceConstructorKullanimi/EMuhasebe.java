package day31_40.day35_inheritanceConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe(){
        //super cons var, extends varsa super var
        System.out.println("Muhasebe Parametresiz Cons");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe Parametreli Cons");
    }
}

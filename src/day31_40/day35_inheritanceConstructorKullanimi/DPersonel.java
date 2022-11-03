package day31_40.day35_inheritanceConstructorKullanimi;

public class DPersonel {

    DPersonel(){

        //super yok cunku extends yok
        System.out.println("Personel parametresiz cons");
    }
    DPersonel(String isim){
        System.out.println("Personel parametreli cons");
    }

}

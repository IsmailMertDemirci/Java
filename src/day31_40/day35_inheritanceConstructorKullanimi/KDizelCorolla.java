package day31_40.day35_inheritanceConstructorKullanimi;

public class KDizelCorolla extends HCorolla{

    KDizelCorolla(){
        System.out.println("Dizel Corolla parametresiz cons");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("Dizel Corolla parametreli cons");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("Hasan");
    }
}

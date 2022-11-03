package day31_40.day35_inheritanceConstructorKullanimi;

public class Child extends Bparent {

    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child() {
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1 = new AGrandParent();
        //bu objeyi olusturmak icin Grandpa cons calisir
        //Parent veya Child cons calismaz

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        // child1 objesi icin Child cons calisir
        /*
        Java'da bir class'i kullanabilmek icin o class'tan obje olusturur,
        dolayisiyla o class'in constructor'ini kullanirdik

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin
        o class'larin constructor'larini otomatik calistiran bir yapi kurmustur

        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde
        Child cons'u kullaniriz

        Java child (){} cons'u gordugunde once parent'in consunu calistirmam lazim der
        buradan Parent cons'a gider
        Parent class'inda Parent (){} cons'unu gorunce de bu parentin parenti var mi diyecek
        boylece parentin parenti olan Grandparent cons'u calistirir
        Boylece extends keyword olmayan class'a kadar gider ve
        oradan baslayarak conslari asagi dogru calistirir
         */
    }
}

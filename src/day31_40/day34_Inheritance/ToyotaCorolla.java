package day31_40.day34_Inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        child classtan parent class'a erisimde access modifier kurallarini
        bypass edemeyiz, mesela parent class'taki private class uyelerini
        child class'tan kullanamayiz, ayni sekilde parent ve child farkli
        packagelerde ise parent class'taki default access modifieri olan
        class uyelerini child class'tan kullanamayiz
         */
        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota


    }
}

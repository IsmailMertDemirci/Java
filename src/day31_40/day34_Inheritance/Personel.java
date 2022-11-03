package day31_40.day34_Inheritance;

public class Personel {
    /*
    1- Child Classlar parent classlar daki tüm özelliklere sahiptir
    2- Child Classlar parent classlardaki bazı özellikleri kendine uyarlayabilir
    3- Child classlar parent classlarda olmayan bazı extra özelliklere sahip olabilir
     */
    /*
    eger parent class olacak sekilde tasarladiginiz bir  class varsa veya
    ileride bu class'i parent yapmak isteyenler olabilir diyorsaniz
    variable ve methodlarin access modifierini "protected" secmelisiniz
     */

    protected int persNo;
    protected String isim="isim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected  void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }
}

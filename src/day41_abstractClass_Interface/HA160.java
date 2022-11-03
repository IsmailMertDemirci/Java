package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{
    /*
    Abstract parent silsilesinden gelen ilk concrete class Parent'i olan class'taki tum abstract method'lari concrete hale
    donusturmek(Override) ZORUNDADIR

    Bu kuralin istisnasi parent class'lardan herhangi birinde concrete hale donusturulmus, abstract methodlardir
     */
    public static void main(String[] args) {

        HA160 arb1 = new HA160();
        //concrete bir class'tan istedigimiz objeyi uretebiliriz

        FMercedes arb2 = new FMercedes();
        //mercedes de concrete

        //EToyota arb3 = new EToyota();
        EToyota arb4=new GCorolla();
        //abstract classlar constructor barindirir ama obje uretemezler
        //Toyota class'i abstract class oldugundan obje uretilemez

        /*
        List<String> list=new List<String>();
        List<String> list2=new ArrayList<>();

        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde data turunu
        istedigimiz abstract class
        constructor'i ise child'i olan concrete bir class'tan seceriz
         */
    }
}

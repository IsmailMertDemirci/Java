package day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /*
    Corolla class'inin 2 tane parenti var
    Corolla parent'larinin ikisinin de standartlarina (abstract method) uymak zorundadir

     Concrete bir class parent'i olan tum abstract class'larda abstract olan methodlari implement
     etmek ZORUNDADIR
     Ancak parent silsilesinde override edilerek concrete yapilan methodlari override etmek zorunda
     DEGILDIR
     */
}

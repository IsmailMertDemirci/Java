package day41_abstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        abstract bir parent'in concrete child class'i inherit ederse parent abstract class'taki tum abstract
        methodlari override etmek zorundadir

        abstract bir class abstract baska bir class'i parent edinirse parent class'taki tum abstract methodlari
        override etmek ZORUNDA DEGILDIR
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    public void motor() {

    }
}

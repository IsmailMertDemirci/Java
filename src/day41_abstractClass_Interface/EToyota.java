package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{
    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    Parent class'taki standart belirleyici methodlar (abstract method)'larin tamami child class
    tarafindan override edilmelidir

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebliriz istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz Toyota class'ini da abstract yapmaniz guzel olur
     */
}

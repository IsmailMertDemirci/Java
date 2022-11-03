package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {
    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunsek iki tane access modifier kullanma ihtimali olamaz
    asagidaki method'da goreceginiz gibi interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java8 den sonra kullanilmaya baslamistir. Bu ozellikten once bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip yeni eklenen method'u override etmemiz gerekirdi
    Bu ozellik sayesinde basina default veya static keyword ekleyerek interface'de yeni ve body'si olan bir method
    olusturursak bu method'un child class'lar tarafindan override edilme mecburiyeti olmaz ve eskiden implement
    etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interfdace icin olusturulan kurallari bozmaz
    Bu method'larin body'si olsa da bunlara concrete method denmez ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi acces modifier degil istisnai durumun belirtilmesi icindir

    o zaman nicin iki keyword yani static ve default tanimlanmistir?
    Bu iki farkli kelimenin amaci child class'lardan bu methoda nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child classdan bu methoda erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa methoda erismek icin obje olusturulmalidir
     */

    public default void teker(){
        System.out.println("default... Tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("static... Tum arabalarin direksiyonu vardir");
    }
}

package day31_40.day35_inheritanceConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    extends keyword kullanilan classlarda ister default cons bulunsun,
    istersek de biz yeni cons(lar) olusturalim, Java cons'un ilk satirina
    super(); constructor call yazar

    super(); cons call default cons'a benzer, gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir cons call yazarsak Java super cons"unu siler
     */
    /*
    eger biz mudahale edip kendi cons call olusturmazsak Javanin default olarak
    olusturdugu cons call her zaman parametresizdir -> super(); seklinde

     */
    FMemur(){
        //super (): cons call var gorunmeyen
        System.out.println("Memur Parametresiz Cons");
    }
    FMemur(String isim){
        System.out.println("Memur Parametreli Cons");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("ali");

    }
}

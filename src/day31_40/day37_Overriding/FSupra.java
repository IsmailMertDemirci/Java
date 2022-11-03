package day31_40.day37_Overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar override edilemez
        Eger child class'da parent class'daki private method ile ayni signature'da bir method
        olusturursaniz bu overriding method OLMAZ
         */
    }

    @Override
    void motor() {
        System.out.println("Sırali 6 silindir 2JZ motor kullanır");
        /*
        methodun ustundeki @Override notu Javaya bir gorev verir
        bu gorev birbirine bagli olan 2 methodu surekli kontrol eder
        Eger parent class'taki overridden methodu silerseniz Override notu CTE verir,
        methodda degil Override yazisinda CTE olur

        @Override notu kullanmak mecburi degildir
        Eger Overridding method silinirse kodun CTE vermesini istersek @Override notu kullanmaliyiz
         */
    }
}

package day11_20.day19_scope;

public class C01_InstanceVariables {
    /*
    class icerisinde her yerden kullanmak istediginiz variableleri class level da
    (class'ın icinde ama methodlarin disinda) genellikle class level variableler class'ın basinda olusturulur
    yani class isminin hemen altina
    (basinda olusturulmasi sart midir? degildir ama biz bu classta class level variable var midir diye bakmak icin
    asagilara kadar incelemeyelim diye genelde basinda olusturulur)

     class leveldaki variableler icin 2 scope vardir
     1-static variables(Class Variableleri da denir)
     2-instance (static olmayan) variables(obje variableleri)

     instance variable class seviyesinde olusturulmali, class isminin hemen alti, not statictir, static methodlarin
     icinden obje yardimiyla, static olmayan methodlardan direk ulasilabilir
     */

    int instSayi=20; //static olmayip class levelda oldugu icin instance variabledir

    public static void main(String[] args) {
        int sayi=10;
        //System.out.println(instSayi); kullanilamiyor, main method static ama instSayi static degil
        /*
        instance variables static olmadigi icin static clube uye olan main methoddan direk kullanilamaz
        instance variablelerin diger adi object variabledir
        dolayisiyla obje olusturursaniz instance variableleri her yerden kullanabiliriz
         */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi);//20 yazar
        obje1.instSayi=30;//inst degiskeni obje icin gecerli, dolayisiyla 30 yaptigimizda 30 yazdirir(hocanin
        // adinin degismesi ornegi,butun hocalarin adinin degistigi anlamina gelmiyor)
        System.out.println("obje 1 degistikten sonra : "+obje1.instSayi);//30 yazar
        //istedigimiz kadar obje olusturabiliriz
        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje 2 degistikten sonra : "+obje2.instSayi);//20, ilk degeri alir, yukaridaki 30 obje1 icin
        obje2.instSayi=25;
        System.out.println("obje 2 degistikten sonra : "+obje2.instSayi);//25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje 3 degismeden once : "+obje3.instSayi);
        //20 her obje olusturuldugunda instance(obje) variablenin ilk atanan degerini alir

    }

    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        bir methodun icerisinde olusturulan variable sadece o methodun icinden kullanilabilir,buna Local Variable
        diyecegiz(Local Variables)
         */

        //instSayi=30; instance variablelere main method disindaki static methodlardan da direk ulasamayiz
        //obje olusturursak ulasabiliriz

        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);


    }

    public void staticOlmayanMethod(){

        System.out.println(instSayi); //burada Java itiraz etmedi
        /*
        instance variableler class icerisindeki static olmayan methodlardan direk kullanilabilir
         */



    }
}

package day31_40.day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe {
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
    /*
    Bir obje olusturulurken Data turu ve constructor ayni class'tan ise direk o class'a gidiyorduk

    Eger data turu ve cons farkli ise, obje constructor'in oldugu class'in objesidir
    ancak bizden istenen Isci class'indaki spesifik ozellikler degil bir iscinin
    muhasebe class'indaki tum calisanlarla beraber sahip oldugu genel ozellikleri yazdirir
     */

        System.out.println(isc1.gunlukMesai);//M 8
        System.out.println(isc1.saatUcreti);//Muhasebe 10
        isc1.maas();//Muhasebe class'indan
        isc1.ozelSigorta();//Muhasebe
        isc1.sigorta();//personel class'indan alacak
        System.out.println(isc1.isim);//personel classtan

        System.out.println(isc1.soyisim);//personelden
        System.out.println(isc1.departman);//personel classtan

        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai);//CTE
        //System.out.println(isc2.saatUcreti);//CTE
        isc2.maas();
        //isc2.ozelSigorta();//CTE
        isc2.sigorta();//
        System.out.println(isc2.isim);//

        System.out.println(isc2.soyisim);//
        System.out.println(isc2.departman);

        /*
        eger data turu olan class'ta aradigimiz ozellik yoksa once parent var mi diye bakar
        o da yoksa CTE verir cunku child class'a donus olmaz
         */



    }

}
package day31_40.day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {
    int saatUcreti = 12;
    int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);
        mmr1.maas();//Memurlar : 3240 maas alir
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//personel class'indan alacak
        System.out.println(mmr1.isim);//personel classtan

        System.out.println(mmr1.soyisim);//personelden
        System.out.println(mmr1.departman);//personelden

        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        her ne kadar memur class'inin icinde olsak da olusturdugumuz obje muhasebe class'indan
        cunku data turu ve constructor BMuhasebe


        String str="Murat";
        ArrayList <Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir classtir
        yani yukaridakiler gibi data turudur
        obje olusturulan her class aslinda bir data turudur

         */
        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas();//Personel minimum : 2400 maas alir
        mhsb1.ozelSigorta();//Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();//Tum personelimize sigorta yapilir
        System.out.println(mhsb1.isim);//Isim belirtilmedi

        System.out.println(mhsb1.soyisim);//Soyisim belirtilmedi
        System.out.println(mhsb1.departman);//Departman belirtilmedi
    }
}

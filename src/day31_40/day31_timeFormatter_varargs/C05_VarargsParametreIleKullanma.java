package day31_40.day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","Ayse","Valerian","Can", "Akin");

        /*
        Varargs teorik olarak sonsuz sayida element alabilir, bir methodda parametre olarak
        varargs varsa varargs'in sinirlarini bilebilmesi icin parametrelerin sonuncusu olmasi
        gerekir, oncesinde farkli parametreler olabilir ama varargs'dan sonra parametre
        OLAMAZ. Bu kuraldan oturu bor methodda sadece 1 tane varargs olabilir
         */
    }

    private static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0]; //ilk elemente en uzunmus gibi davranalim
        //sonra yeni gelen uzunsa yer degistirelim

        for (String each:kelime
        ) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : "+ enUzunKelime);
    }
}


package day31_40.day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Valerian","Can");
    }

    private static void enUzunKelimeyiYazdir(String... kelime) {

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

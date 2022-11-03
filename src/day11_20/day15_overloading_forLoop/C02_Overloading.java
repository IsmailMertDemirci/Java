package day11_20.day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        Javada olusturdugumuz methodlarin isminin yaptigi islev ile uyumlu olmasini
        isteriz, mesela bir stringin bir bolumunu almak icin
        Java 2 adet substring() methodlari veya
        verilen stringdeki bazi parcalari yenileriyle degistirmek icin 2 adet replace
        methodu var
        Java ayni isimde birden fazla method varsa hangisinin kullanilacagina
        parametre sayisi ve parametrelerin data turune gore karar verir
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);//2 yazarsam farklı method
        str.substring(2,4);//dersem farkli method kullanir, adlari ayni yollari farkli
        str.replace('c','v');//replace de 2 tane var ayni olsa da var
        str.replace("J","H");//substring 2 tane ayni olsa da var

        /*
        Ayni isimde ama farkli methodlari olusturmak icin degistirebilecegimiz seyler
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile parametrelerin data turleri degisebilir
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda parametrelerin
        siralanisi
         */

    }
}

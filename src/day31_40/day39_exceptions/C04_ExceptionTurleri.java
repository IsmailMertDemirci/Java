package day31_40.day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {
        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java Compile Time'da bunu farkeder ve size izin vermez
         */
        str=null;
        // System.out.println(str.length());
        // NullPointerException
        Object obj= "Java Java Java";
        Integer sayi= (Integer)obj; // ClassCastException yani stringi integere cast edemezsin diyor ama yazimda itiraz etmiyor
        /*
        obj herkesin atasi oldugu icin yukaridaki sekilde yazabiliyoruz
        fakat alt tarafta obj nin onune cast yani () icine Integer yazmazsak Java kabul etmez
        cunku object genis Integer dardir, o sebeple casting yani (Integer) yapmak zorundayiz
         */

        /*

        String str2="Hava Civa";
        Integer sayi2=str2;
        Java bazi casting islemlerine compile time'da izin vermez
        Ancak bazen syntax uygun olabilir
        bu durumda java kodun calismasina itiraz etmez
         */
        Thread.sleep(5000);
    }
}

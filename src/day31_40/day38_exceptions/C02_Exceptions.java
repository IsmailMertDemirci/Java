package day31_40.day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;

        while (sayac < 100) {
            /*
            try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak
            icin kullanilir
            catch den sonraki parantez karsilasmayi bekledigimiz exception turunu Javaya
            soylemek icin kullanilir
            catch blogu Javaya soyledigimiz exception (istisnai durum) gerceklesirse Javanin
            yapmasini istedigimiz islemdir

            catch blogunun onundeki paranteze karsilasmayi bekledigimiz exception'i yazabilir veya
            her turlu exception'da devreye girmesini istiyorsak tum exception'larin parenti olan
            Exception yazabiliriz
             */
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {//Exception e yazan yere istedigimiz spesifik bir Exception da yazabiliriz
                throw new RuntimeException(e);//sout"payda 0 oldu dikkatli ol diyebiliriz satiri silip
            }
            b--;
            sayac++;
        }
    }
}

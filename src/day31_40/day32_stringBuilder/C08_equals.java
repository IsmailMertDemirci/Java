package day31_40.day32_stringBuilder;

public class C08_equals {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true

        // StringBuilder'da equals method'u ancak ayni obje olursa true doner
        // String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str)); //false

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4, a e den 4 birim onde a b c d e
        /*
         compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
         ilk harfler ayni ise, ikincilere gecer, ikinciler ayni ise 3.lere gecer ve
         ilk farkli olan harfe kadar gider.Farkli olan iki harfin ascii kodlari arasindaki
         farki verir, eger hic farkli harf yoksa sonuc olarak 0 dondurur
         */
    }
}

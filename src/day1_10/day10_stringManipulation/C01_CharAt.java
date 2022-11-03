package day1_10.day10_stringManipulation;

public class C01_CharAt { //class isminde en bastaki harf buyuk olacak C01 deki gibi
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); //ilk harf J yazdirir
        System.out.println(str.toUpperCase().charAt(7)); //R yazdirir

        //atama olmadigi icin to upper case hepsini buyuk yapmadi
        //sadece sout icindeki harf icin buyuk yapti

        System.out.println(str.charAt(21));

        System.out.println(str.charAt(22)); //şndexoutboundexception hatasi verir

        //son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        //eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java exception verir

        //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        //String methodlarindan kullanmamiz gereken bir method varsa
        //charAt() den once kullanmaliyiz



    }
}

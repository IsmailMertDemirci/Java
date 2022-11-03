package day31_40.day32_stringBuilder;

public class C03_ReverseMethodu {
    public static void main(String[] args) {
        //verilen bir inputu tersine cevirip bize donduren bir method olusturun

        String input=" Hey gidi for loop gunleri";

        String tersInput= tersineCevir(input);
        System.out.println(tersInput);
    }

    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        return  sb.reverse().toString();




    }
}

package day31_40.day32_stringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        System.out.println(sb); //Kayra

        sb.subSequence(0,3);
        System.out.println(sb);//Kayra

        /*
        Method String donduruyorsa ya da Subsequence donduruyorsa bunu yeniden StringBuildere
        atama sansi olmadigindan StringBuilderin eski hali degismez
        StringBuilderin icerisinde sonucu string olan methodlar varsa string immutable oldugu icin
        bunu da immutable yapiyor yani Kayra degismiyor
         */


    }
}

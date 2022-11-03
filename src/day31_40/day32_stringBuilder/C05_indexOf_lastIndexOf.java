package day31_40.day32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pay attention please");

        sb.indexOf("Pay");
        System.out.println(sb.indexOf("Pay"));//0
        System.out.println(sb);//Pay attention please

        System.out.println(sb.indexOf("e"));//7

        System.out.println(sb.indexOf("e",10));//16 10. indeksten sonraki ilk e

        System.out.println(sb.lastIndexOf("e"));//aramayi sondan yapip indeks sayimini bastan yapiyor 19

        System.out.println(sb.lastIndexOf("e",10)); //10. indeksten onceki ilk e//7


    }
}

package day31_40.day40_final;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.isim = "Alp";
        //obj.okul="Java Koleji";//A classinda okula final yazinca altini cizer ve degistirilemez

        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */
    }
}


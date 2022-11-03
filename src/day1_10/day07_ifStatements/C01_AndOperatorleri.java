package day1_10.day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);
        System.out.println(a<0 && b<20 && c>=b); //false


        System.out.println(a<0 & b<20 & c>=b); // tek & ve çift && arasindaki fark && oldugunda Java
        //bir tane false gorunce devamina bakmadan sonucu false yapar cunku AND operatorunde 1 false bile sonucun
        //false olmasi icin yeterlidir, fakat tek & oldugunda Java islemin tum sartlarini kontrol eder ve
        //sonucu oyle belirler, bu sebeple & operatoru && e gore yavas calisir

    }
}

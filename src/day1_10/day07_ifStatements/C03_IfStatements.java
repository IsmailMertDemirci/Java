package day1_10.day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Bir if statement'da {} kullanilmazsa Java ilk satiri sart ile baglar, ikinci satir bagimsiz olur
        bu ornekte -23 girildiginde hicbir if calismaz fakat {} olmadigindan soutlar calisir ve ekrana
        pozitif kalacaktir ile cift kalacaktir yazisi cikar
        Eger birden fazla satir if sartina baglanmissa mutlaka {} kullanmaliyiz
         */

        int sayi = -23;

        if (sayi > 0)
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");

        if (sayi % 2 == 0)
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir");

        if (sayi % 5 == 0)
            System.out.println("sayi 5'in tam kati");

    }
}

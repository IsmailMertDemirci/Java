package day1_10.day07_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int sayi=10;

        if(sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'in tam kati"); //sayi 12 desem ilk 2 if calisir son if calismaz,
            //negatif sayi yazarsak hicbir sey cikmaz fakat bu kodun calismadigi anlamina gelmez, exit code 0
            //cikarsa bu kodun calisigi anlamina gelir
            //birden fazla basit if cumlesi varsa girilen sarta bagli olarak tumunde if body calisabilir(10 sayisi),
            //kismen calisabilir(23 sadece ilk if calisir) veya hicbir if body'si calismaz(-23 durumu)
        }
    }
}

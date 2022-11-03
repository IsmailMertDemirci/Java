package day11_20.day17_nestedForLoop;

public class C07_WhileLoop {
    //20 den 50 ye kadar cift sayilari yazdirin

    public static void main(String[] args) {
        int bas=20;
        int bitis=50;

        for (int i = bas; i <=bitis ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        int temp=bas;
        while (temp<=bitis){
            if(temp%2==0){
                System.out.print(temp+" ");
            }
            temp ++; //bu son kısmı unutmamak zorundayız, artacak olan ne ise onu bu sekilde yazmak zorundayiz
        }
    }
}

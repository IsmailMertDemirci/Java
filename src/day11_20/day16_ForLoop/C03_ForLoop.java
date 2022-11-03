package day11_20.day16_ForLoop;

public class C03_ForLoop {
    /*
        10 ile 30 arasindaki sayilari aralarinda virgul olacak sekilde yazdirin
     */

    public static void main(String[] args) {
        int bas=10;
        int son=30;

        for (int i = bas; i <=son ; i++) {

            if (i<son){
                System.out.print(i+", ");
            }else{
                System.out.println(i);
            }

        }
    }
}

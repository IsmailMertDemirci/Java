package day11_20.day16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim
        int input=120;
        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.print(i + " ");
            }
        }
    }
}

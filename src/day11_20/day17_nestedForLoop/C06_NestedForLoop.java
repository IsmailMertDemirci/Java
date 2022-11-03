package day11_20.day17_nestedForLoop;

public class C06_NestedForLoop {
    /*
    verilen stringi bir önceki sorudaki şekil gibi yazdirin
     */
    public static void main(String[] args) {
        String input="Deniz";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));//substring ilk harf icin (0,1) olmali, j 1 den basladigi icin
                                                           //j-1,j yazdik

            }
            System.out.println("");
        }
        for (int i = input.length()-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));//substring ilk harf icin (0,1) olmali, j 1 den basladigi icin
                                                           //j-1,j yazdik

            }
            System.out.println("");
    }
}
}

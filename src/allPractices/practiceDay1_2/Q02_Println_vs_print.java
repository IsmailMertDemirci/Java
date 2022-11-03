package allPractices.practiceDay1_2;

public class Q02_Println_vs_print {
    //ikisinin arasindaki tek fark print ln butun satiri aliyor, print ise imlecin ayni satirda kalmasini sagliyor

    public static void main(String[] args) {
        System.out.println("****println****");
        System.out.println("welcome");
        System.out.println("java");
        System.out.println("practice"); // alt alta welcome java class yaziyor

        System.out.println("****print****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" class"); //welcome java class yaziyor
    }
}

package allPractices.practiceDay4;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız. yani ascii tablosu

    public static void main(String[] args) {
        System.out.println("for ile cozum");

        for (int i = 0; i <= 255; i++) {
            char c = (char) i; //casting yaptik
            System.out.println(i + " -> " + c);
        }
        System.out.println();
        System.out.println("while ile cozum");

        int i = 0;
        while (i <= 255) {
            char ch = (char) i;
            System.out.println(i + " - " + ch);
            i++;
        }
        System.out.println();
        System.out.println("do while ile cozum");

        int a = 0;
        do {
            char karakter = (char) a;
            System.out.println(a + " " + karakter);
            a++;
        } while (a <= 255);
    }
}

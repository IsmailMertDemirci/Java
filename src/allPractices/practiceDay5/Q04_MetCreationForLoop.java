package allPractices.practiceDay5;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Bir String giriniz");
            String str = scan.nextLine();

            System.out.println(reverseString(str));

        }

    private static String reverseString(String str) {
            String reversed ="";
        for (int i = str.length()-1; i >=0 ; i--) { //baslangici stringin tersi olacagi icin -1
            reversed+=str.charAt(i);
        }
            return reversed;
    }
}

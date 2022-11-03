package allPractices.practiceDay4;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {

          Scanner scan=new Scanner(System.in);
          System.out.println("donusturmek istediginiz cm degerini giriniz");
          double value=scan.nextDouble();

          convert(value);
      }

    public static void convert(double value) {
          double meter=value/100;
          double kMeter=value/100000;
        System.out.println("girdiginiz cm degeri : "+value+ "" +meter+" metredir, "+kMeter+" km dir");

    }
}

package allPractices.practiceRecap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
    /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy=scan.nextDouble()/100; //boyu metreye çevirmiş olduk

        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo=scan.nextDouble();

        double vke;
        vke=kilo/boy*boy;

        if (vke<=20){
            System.out.println("Oldukca zayifsiniz");
        }else if(vke<=25){
            System.out.println("Normal sinirdasiniz");
        }else if(vke<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else{
            System.out.println("Obez grubundasiniz");
        }
    }
}

//String sonuc= vke<=20 ? "Oldukça Zayıfsınız" : vke<=25 ? "Normal Sınırlardasınız" :
//                vke<=30 ? "Şişmansınız": "Obezsiniz";

/*
if(bmi<=20){
                System.out.println("bmi indexiniz " +bmi + " oldukca zayifsiniz");
            }else if(bmi<=25){
                System.out.println("bmi indexiniz " +bmi + " normal sinirlardasiniz");
            }else if(bmi<=30){
                System.out.println("bmi indexiniz " +bmi + " sisman kategorisindesiniz");
            }else if(bmi>30){
                System.out.println("bmi indexiniz " + bmi + " obez grubundasiniz");
 */
package allPractices.practiceDay11_InterviewQuestions;

import java.util.Scanner;

public class Q03 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3;



        while (true){
            System.out.println("sifre gir");
            String girilenSifre=scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("sifre dogru");
                break;
            }else {
                System.out.println("sifre yanlis");
                girisSayisi--;
                System.out.println("kalan giris hakkiniz "+girisSayisi);
            }
            if (girisSayisi==0){
                System.out.println("Kartiniz bloke oldu");
                break;
            }
        }
    }
}

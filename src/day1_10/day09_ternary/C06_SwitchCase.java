package day1_10.day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin, hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input="pazar";
        input=input.toLowerCase(); //input yazdigimiz icin kodu calistirdigimizda gunu kendimiz degistirecegiz,
                                  //scanner olsaydi koda kisminda girerdik, bir onceki ornekten farkli olarak
                                  //bu ornekte fazladan neden break yazmamamiz gerektigini ogrendik

        switch (input){
            case"pazartesi":
            case"sali":
            case"carsamba":
            case"persembe":
            case"cuma":
                System.out.println("Hafta ici");
                break;
            case"cumartesi":
            case"pazar":
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }


        switch (input){
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}

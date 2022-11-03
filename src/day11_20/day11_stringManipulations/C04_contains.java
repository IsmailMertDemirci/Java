package day11_20.day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cümle isteyin.
        Cümle “buyuk” kelimesi içeriyorsa tum cümleyi buyuk harf olarak,
        “kucuk” kelimesi içeriyorsa tum cümleyi kucuk harf olarak yazdirin,
        iki kelimeyi de içermiyorsa “Cümle kucuk yada buyuk kelimesi içermiyor” yazdirin.
         */

        //Scanner ile degil String input alacagiz

        String cumle="Java buyuk,dunya kucuk";// buyu, kucu, buyuk ve kucu, buyu ve kucuk seklinde dene
        cumle=cumle.toLowerCase();

        //requirements'de kucuk buyuk harf hassasiyeti hakkinda bir sey soylenmemis
        //ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        //bu durumda gorevi bize kim verdiyse ona sormak lazim

        //ek requirements: ikisini de iceriyorsa "karar ver, buyuk mu kucuk mu yazdirayim?"
        //case sensitive olmasin
        //en sinirlandirici olan ifadeyi en bastaki if'e yazmamiz lazim

        if(cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver, buyuk mu kucuk mu yazdirayim?");
        }else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cümle kucuk yada buyuk kelimesi içermiyor");
        }

    }
}

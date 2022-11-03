package day11_20.day11_stringManipulations;

public class C06_endsWith {
    /*
    Kullanicidan email adresini isteyin
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin"
     */
    public static void main(String[] args) {
        String input="fatih@gmail.com"; //farkli sonuclar icin inputu degistir

        if(!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(input.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }






}

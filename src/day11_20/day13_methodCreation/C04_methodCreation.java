package day11_20.day13_methodCreation;

public class C04_methodCreation {
    public static void main(String[] args) {
        /*
        input olarak verilen 2 integeri toplayip sonucunu yazdiran
        bir method olusturalim
         */

        int input1=10;
        int input2=20;

        //method 4 adimda olusturulu
        //1. adim method call(topla dedim neleri toplayacak)
        //2. adim argument eklenmesi gerekiyorsa eklemek
        //eger methodun return type'i voidden farkli olacaksa bir variable olusturup
        //method call'u assign edelim



        topla(input1,input2);
    }

    public static void topla(int input1, int input2) {
        //3. adim method deklerasyonunda degistirilmesi gereken
        //bolumleri degistir(acces modifier ya da return type degisebilir vb)
        //yukaridaki private sadece bu class kullanir demek, istersek public yapariz,yaptik
        //4. adim eger return type void disinda bir seyse
        //return keywordu ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayinin toplami :"+(input1+input2));
    }

}

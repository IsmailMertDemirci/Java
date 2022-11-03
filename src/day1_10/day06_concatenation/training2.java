package day1_10.day06_concatenation;

public class training2 {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri silelim dersek kelimeler arasindaki bosluklar da siliniyor, onlari korumak
        //icin en basta cumlede bulunmayacak bir string koyalim
        //"qazwsx" gibi bir cumlede arka arkaya olmayacak bir ifade koyalim

        str=str.replace(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W", "");
        System.out.println(str);//bosluklar */- hepsi gitti

        str=str.replaceAll("\\d", "");

        //istenmeyen ozel karakter ve sayilardan kurtulduk simdi spaceleri geri getirelim

        str=str.replace("qazwsx", " ");
        System.out.println(str);

    }
}

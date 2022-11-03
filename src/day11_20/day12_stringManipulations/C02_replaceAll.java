package day11_20.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'i Bugun Java cok guzel haline getirin
        //replace ile yaparsak selale gibi olur 1 i hiclikle,2yi hiclikle 3u hiclikle....
        //replace all burada ise yariyor

        //replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil gibi
        //bugun ozel karakterleri, bosluklari sil gibi

        //tum ozel karakterleri silelim dedidigimizde space ler de siliniyor
        //spaceleri korumak icin onlarin yerine cumlede bulunmayacak bir string koyalim
        //harf kalibindan olusabilir mesela, bir cumlede arka arkaya olamayacak harf dizisi
        //qazwsx gibi

        str=str.replaceAll(" ", "qazwsx");
        System.out.println(str);

        str=str.replaceAll("\\W","");//boşluk da ozel karakter oldugundan
        // hepsini goturur, bir ustteki satirda o yüzden bosluk yerine harf dizisi atadik
        System.out.println(str); // harf ve rakam disindaki her seyi sil,1Bu2gu3nJavacokg3uzel oldu

        str=str.replaceAll("\\d","");

        //istenmeyen ozel karakter ve sayilardan kurtulduk, simdi spaceleri geri getirelim

        str=str.replace("qazwsx"," "); //replace yaptik, sadece harf dizisini degistirmek icin
        System.out.println(str);

    }
}

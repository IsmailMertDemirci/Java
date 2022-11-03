package day1_10.day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); //5 döndürür
        System.out.println(str.indexOf('g')); //6 döndürür
        System.out.println(str.indexOf("t")); // -1 döndürür, olmayan butun karakterler icin

        String str5= "wertyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";

        //str 5 de p harfi var midir? bunu bulmanin kisa yolu indexof()==-1 mi diye sormak
        //bu sekilde -1 cikarsa yoktur, cikmazsa vardir deriz

        if(str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanilmis");
        }else{
            System.out.println("str5 de istenen karakter kullanilmis");
        }
    }
}

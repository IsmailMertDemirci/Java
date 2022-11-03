package day11_20.day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        /*
        Indexof verilen bir stringde herhangi bir string veya char'in ilk kullanildigi indexi bize
        döndürür
         */

        System.out.println(str.length());
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("g")); //6
        System.out.println(str.indexOf('j')); //-1 (buyuk kucuk harf duyarlidir)
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("mek"));//10

        //eger istedigimiz indexten sonrasini kontrol etmek istersek
        //o zaman ayni methodu iki parametreli olarak kullaniriz

        System.out.println(str.indexOf("g",6)); // 6 verir cunku 6 dahil 6 dan sonrasina bakar
        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        //2. e yi bulabilmek icin once 1. e nin indexi lazim

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //eger 2. e varsa 3. e nin olup olmadigini ve varsa indexini yazdiralim, ikinci e varsa indexi -1 degildir

        if(ikincie==-1){
            System.out.println("verilen str'da ikinci e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if(ucuncue==-1){
                System.out.println("verilen str'da ucuncu e yok");
            }else{
                System.out.println("verilen str'daki 3. e nin indexi: "+ucuncue);
            }
        }
    }
}

package day11_20.day13_methodCreation;

public class C03_stringManipulation {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak
        “ Java ogrenmek123 Cok guzel@ ” String’ini
        "Java öğrenmek cok güzel.” sekline getirin.
         */

        String str= " Java ogrenmek123 Cok guzel@ ";
        str=str.trim();
        str=str.replaceAll("\\d","");
        str=str.replace("@","");
        str=str.replace("C","c");
        str=str+".";
        System.out.println(str);

        /*
        String str = " Java ogrenmek123 Cok guzel@ ";
       str = str.replaceAll("\\d","") // " Java ogrenmek Cok guzel@ "
                .replace(" ","x")     // "xJavaxogrenmekxCokxguzel@x"
                .replaceAll("\\W","") // "xJavaxogrenmekxCokxguzelx"
                .replace("C","c")     // "xJavaxogrenmekxcokxguzelx"
                .replace("x"," ")     // " Java ogrenmek cok guzel "
                .trim();                              // "Java ogrenmek cok guzel"
System.out.println(str);
         */


    }
}

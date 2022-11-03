package day1_10.day06_concatenation;

public class training {
    public static void main(String[] args) {

        String str=" Bugun ha va cok guz el ";
        System.out.println(str.replace(" ", ""));

        //hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        //guz el yerine harika

        System.out.println(str.replace("guz el","harika"));

        //cumleyi replace kullanarak Bugun Java cok guzel yapalim

        str= str.replace(" Bu gun", "un")
                .replace("ha va","Java")
                .replace("guz el", "guzel");

        System.out.println(str);


    }
}

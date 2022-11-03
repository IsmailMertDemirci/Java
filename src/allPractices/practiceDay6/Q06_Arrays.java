package allPractices.practiceDay6;

import java.util.Arrays;

public class Q06_Arrays {
    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */
    public static void main(String[] args) {
        String str = "HeySiri";
        str=str.replace("Hey","Bye");

        String[] arr = new String[1];//1 elemanli array yaptik

        arr[0]=str;//1 elemanli arrayin de ici str olsun, str de yukarida ByeSiri oldu

        System.out.println(Arrays.toString(arr));
    }
}

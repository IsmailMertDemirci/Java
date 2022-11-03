package day11_20.day16_ForLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {
        //baslangic nokasindan sonra bitis sartina yaklasmiyorsak "sonsuz loop" olusur


        //for (int i = 0; i >-10 ; i++) { //sonsuz donguye girer
            //System.out.println(i);


        // eger ilk deger icin bile bitis sarti saglanmiyorsa for loop calisir
        //ama loop body'si hicbir zaman devreye girmez(calismaz)

        for (int i = 0; i >5; i++) { //0>5 olmayacagi icin false olur ve loop broken meydana gelir
            System.out.println(i);

        }
        }
    }


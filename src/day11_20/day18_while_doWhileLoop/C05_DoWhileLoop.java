package day11_20.day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    /*
    9 dan 190a kadar olan 7 nin kati olan tum tamsayilari yazdiriniz
     */
    public static void main(String[] args) {
        int bas=9;
        int bitis=190;

        int temp=bas;

       while(temp<bitis){
           if(temp%7==0){
               System.out.print(temp+" ");
           }
           temp++;
       }
       //do while ile yapalim
        System.out.println("");
        temp=bas; //bunu yapmazsak ustteki kisimda son deger ile devam eder
        do{
            if(temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }while (temp<bitis);
    }
}

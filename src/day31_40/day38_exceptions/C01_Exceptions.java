package day31_40.day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        bir sorunla karsilasmayi bekledigimiz noktalarda if else ile sorunu yakalayip
        onunla ilgili cozum uretebiliriz
        Sorunu her zaman if else ile cozemeyecegimizden Java try-catch bloklari olusturmustur
         */

        int a = 10;
        int b = 0;

        System.out.println(a/b);//Arithmetic Exception

        int c = 1000;
        int d = 50;
        int sayac=1;

        while (sayac<100){
            System.out.println(c/d);
            b--;
            sayac++;//1000/50 den basladi 1000/0 a kadar gitti ve 0 da Arithmetic Exception verdi
        }//bu ongorulebilir bir hata, yani kodu yazdigimizda bunun olacagini biliriz
    }//o zaman Javaya problem ile karsilasirsan su cozum yolunu kullan demeliyiz
    /* asagidaki gibi if else koyarak cozebiliriz ama her zaman if else olmayabilir
    int c = 1000;
        int d = 50;
        int sayac=1;

        while (sayac<100){
            if(b==0){
            sout(" islem yapilirken payda 0 oldu dikkat etmelisiniz
            else{
            System.out.println(c/d);
            b--;
            sayac++;}
     */



}

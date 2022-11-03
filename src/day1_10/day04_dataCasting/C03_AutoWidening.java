package day1_10.day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        //dar veri turundeki degeri genis veri turundeki variableye otomatik olarak assign eder

        byte sayi1=23;
        short sayi2=55;

        int sayi3=sayi1+sayi2; //java itiraz etmedi cunku sayi1 byte, sayi2 short, ikisi de integerin icine sigar


        double sayi4=sayi1*sayi2;// java yine itiraz etmez, byte ve short doublenin icine sigar


        sayi4=sayi2/sayi1;  //2.0 yazdirir cunku once islem sonra atama kurali, sayi1 ve 2 int oldugundan 2.391 yazmaz,
                            // 2 yazar, eger biz sayi4=(double)sayi2/sayi1 yazsaydik o zaman 2.391 yazardi, cunku
                            //sayilardan birini double yaptigimiz anda digerini de kapsayacagi icin kusurat gelir
                            // sayi 4 de double oldugundan sonucu 2.0 gosterir

        sayi4= (double) sayi2/sayi1; // yazilirsa o zaman sonucu 2.391 gosterir

    }
}

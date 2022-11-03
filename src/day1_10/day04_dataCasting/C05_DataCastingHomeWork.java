package day1_10.day04_dataCasting;

public class C05_DataCastingHomeWork {
    public static void main(String[] args) {

        //Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1=5;
        short sayi2=sayi1;
        int sayi3=sayi2;
        float sayi4=sayi3;
        double sayi5=sayi4;

        System.out.println("sayi1:"+sayi1+"\n"+"sayi2:"+sayi2+"\n"+"sayi3:"+sayi3+"\n"+"sayi4:"+sayi4
        +"\n"+"sayi5:"+sayi5);

        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi6=100;
        short sayi7=(short) sayi6;
        byte sayi8=(byte) sayi7;

        System.out.println("sayi6:"+sayi6+"\n"+"sayi7:"+sayi7+"\n"+"sayi8:"+sayi8);

        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin

        float sayi9=22.6f;
        System.out.println("sayi9:"+sayi9);

        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin

        double sayi10=255.36;
        int sayi11=(int) sayi10;
        byte sayi12=(byte) sayi11;

        System.out.println("sayi10:"+sayi10+"\n"+"sayi11:"+sayi11+"\n"+"sayi12:"+sayi12);

        //Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int sayi13=53;
        int sayi14=17;

        System.out.println("sayi13/sayi14:"+sayi13/sayi14);

        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int sayi15=67;
        double sayi16=9.3;
        System.out.println("int/double:"+sayi15/sayi16);

        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        double sayi17=22.6;
        int sayi18=7;
        float sayi19=158.7f;
        System.out.println("double/int:"+sayi17/sayi18);
        System.out.println("float/int:"+sayi19/sayi17);
        System.out.println("double/float:"+sayi18/sayi19);
    }
}

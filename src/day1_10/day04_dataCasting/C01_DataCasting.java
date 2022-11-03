package day1_10.day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf +1); //kod bu durumda sağdaki işlemi yapar
                               // char yeniHarf= 97 +1 yapar yani 98 olur
                                // char bir variable 98 olamayacağı için Java hata verir

        System.out.println(yeniHarf);

        /*
        Bazen bir variableye olusturuldugu data turu disindan deger atanabilir
        bunlardan bazisini Java otomatik olarak kabul eder

        Java eger bu deger atamasinda sorun olusacagini (data kayiplarinin olabilecegi veya
        datanin baskalasabilecegi) gorurse bu durumda otomatik olarak bu atamayi kabul etmez
        sizden eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */
        int sayi1=(int)7.3;
        System.out.println("sayi1 :" + sayi1); //7.99 bile olsa 7 gosterir, kusurat ne olursa olsun yok eder

        double sayi2=10;
        System.out.println("sayi2 :" + sayi2); // 10.0 yazdirir

        int sayi3 ='c';
        System.out.println("sayi3 : " + sayi3); //99

        char harf2=98;
        System.out.println("harf2 :"+ harf2); //b
    }
}

package day1_10.day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1=50;

        byte sayi2= (byte) sayi1;

        System.out.println(sayi2); //ekranda 50 gorunur

        /*
        Genis data turundeki degeri dar data turundeki variableye atamak isterseniz java sizin genis data
        turundeki degerin dar data turunun sinirlarina uyup uymayacagini calistirana kadar bilemez
        ama java risk almaz
        Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekler
        bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterlidir

        Bu riski ustlendigimizde 3 durum olusabilir
        1- bizim degerimiz, dar kalip degerlerine uygun olursa hicir kayip olmadan cast olur
        2- double bir sayiyi integere cast etmek gibi durumlarda data kaybi yasanabilir 2.391 orneginde 2.0 yazmasi
        3- genis kaliptan degeri dar kaliba koydugunuzda sinirlari asan durumlarda veri baskalasabilir byteda 130
        diyince -126 cikmasi gibi
         */
    }
}

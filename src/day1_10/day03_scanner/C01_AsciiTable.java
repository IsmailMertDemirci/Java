package day1_10.day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        // Bir tam sayi bir de char degisken olusturup toplamlarini yaziniz

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);//10+a degil 107 oldu
        System.out.println(sayi*harf);
        System.out.println(str+harf);  //banana
        System.out.println(harf+2);
        System.out.println(str+sayi+harf); //banan10a
        System.out.println(""+sayi+harf);

        //char yeniHarf=harf+2; --> bunu // olmadan yazamayiz, kabul etmez

        /*
        char data turu isleme girdigi degiskenin turune gore farkli davranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir
        sayi+harf sayi variablesi int oldugundan harf variablesi ascii tablosundan 97 degerini kullanir

        char yeniHarf=harf+2 java once sagdaki islemi yapar, sagda int + char gorunce ascii degerini alir
        ve sonucu 99 bulur, sonra atama islemi yapmaya calisir, o zaman son durum
        char yeniHarf = 99; bu atama java acisindan kabul edilebilir degildir

        (str+harf);  //banana olmasinin sebebi string variablenin cok guclu olmasidir, hangi data turu ile isleme
        girerse girsin diger data turunu kendine benzetir

        peki consolda 10a görmek istersek nasil yazdirmaliyiz System.out.println(""+sayi+harf);  "" yazmamizin sebebi
        stringi ifade etmesi sebebiyle yanindaki iki degeri string gibi yanyana yazmayi saglar
        sout("10a") yazarsak da çıktı olarak 10a yazar fakat biz elimizdeki variableler ile bunu yapmaya calistik

         */
        char deger='1';
        System.out.println(deger+harf); //'1' + 'a' =49+97=146

    }
}

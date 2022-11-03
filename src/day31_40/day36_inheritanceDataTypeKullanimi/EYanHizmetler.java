package day31_40.day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe{
    int saatUcreti = 9;
    int gunlukMesai = 12;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        Overriding child class'taki bir methodun parent class'ta ayni isimdeki methodu etkisiz
        hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding'i nerede dikkate aliyoruz?
        -bir obje olusturulurken data turu ve constructor farkli ise

        eger bir obje olusturulurken data turu ve constructor farkli ise objenin ozelliklerini
        belirlerken 3 konuya dikkat cekmeliyiz

        1-Obje constructor'in oldugu class'ta olusur
        2-Objenin ozelliklerini aramaya data turunun oldugu class'tan baslariz
          bu classta aranan ozellik bulunamazsa parent class'lara bakilir
          orada da yoksa CTE verir

        Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
        3-Aranan ozellik method ise degeri yazdirmadan once override edilmis mi diye
        kontrol etmemiz gerekir. BU COK ONEMLI***
        Eger override edildiyse en guncel degeri yazdiririz
         */

        BMuhasebe yh1 = new EYanHizmetler();

        System.out.println(yh1.gunlukMesai);//Muhasebe class'indan alacak 8
        System.out.println(yh1.saatUcreti);//Muhasebe class'indan alacak 10
        yh1.maas();//once muhasebeye gider fakat oradaki maas OR oldugundan kendi classina bakar
        yh1.ozelSigorta();////Muhasebeye gider OR yok diye
        yh1.sigorta();//Personelden calistirir
        System.out.println(yh1.isim);//Personelden calistirir

        System.out.println(yh1.soyisim);//Personelden calistirir
        System.out.println(yh1.departman);//Personelden calistirir

        //System.out.println(yh1.issizlikSigorta);
        //kendi class'inda olmasina ragmen CTE veriyor cunku bakmaya once muhasebeden basladik,
        //sonra parente gittik ikisinde de yok, olsaydi da override edilmis mi diye bakmaliydik,
        // o yuzden CTE verdi cunku asagi bakmaz hep yukari gider



    }
}

package day21_30.day30_immutable_date;

public class C02_StringHavuzu {

    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1 == str3);//false

        System.out.println(str1.equals(str4));//true
        System.out.println(str1 == str4);//true

        System.out.println(str2.equals(str4));//true
        System.out.println(str2 == str4);//false

        /*
        Yeni bir String olustururken
        1-esitligin saginda new keywordu olursa Java direk yeni bir
        obje olusturur ve referansini olusturur

        2-eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa  String
        immutable oldugundan degisikligi kaydetmek uzere hemen bir kopya String ve
        referansi olusturur, sonra degeri hesaplayip bu yeni kopya objenin icine koyar
         */

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5));//true
        System.out.println(str5==str1);//true

        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true



        /*
        eger yeni String objesi olusturulurken new kelimesi kullanilmaz veya esitligin
        saginda + islemi olmazsa Java zararin neresinden donsek kardir mantigiyla
        daha once yaptigimiz Stringlere bakiyor ve birebir ayni olan Stringler varsa
        (String Havuzu) yeni bir obje kurmasina ragmen referansini ayni yapiyor, str1 ve str5 in
        objeleri farkli olmasina ragmen referanslari aynidir, buna STRING HAVUZU deniyor
        == da false ifadesi gormemizin sebebi hem deger hem de referansin ayni olmamasidir
        icerik ayni olsa da referans degistiginden false veriyor
         */

        System.out.println(str5==str6);//true
    }


}

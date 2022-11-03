package day31_40.day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ina ulasabildim, degistirebildim(set)
        //ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable'ina ulasimi
        //tamamen serbest yapabilir veya tamamen engelleyebilirim
        //private yaptigim modele ulasamayiz
        //yani access modifier ya hep ya hic diyor

        //modeli degistirelim ama goremeyelim
        //yakiti da gorelim ama degistiremeyelim

        //set ve get yetkilerini ozel olarak tanimlamak istersek
        // 1-ozel yetki tanimlayacagimiz variableleri private yap
        //pivate bir dataya baska classlardan ulasmak mumkun olmadigindan
        //2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla");//model olarak Corolla atadik
        //modeli yazdiramayiz cunku getter methodu yok
        System.out.println(arb1.getYakit());//yakit olarak elektrikli bilgisini yazdirdik
        //yakiti degistiremeyiz cunku setter methodu yok


    }
}

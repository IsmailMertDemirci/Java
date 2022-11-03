package day42_abstractClassVeInterface;

public interface I03_Interfaces {
    int SAYI=20;
    // int sayi; calismaz
    /*
    interface'lerde tum variable'lar public static ve final'dir. Dolayisiyla sonradan deger atama sansimiz yoktur
    bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

    Bir interface bir class'i parent edinemez
     */
    void yakit();
    /*
    Interface icerisindeki bir method public ve abstract ozelliklerine sahiptir

    abstract bir methodun body'si olmasi mumkun degildir
    Java sonradan developer'larin istegi uzerine kismi bir update yapmistir

    Bir interface'e sonradan bir abstract method eklerseniz o interface'i daha once implement etmis tum
    class'lara gidip hepsinde yeni eklenen methodu override etmeniz gerekir bu da buyuk ve eskiden gelen
    projeler icin cok zor bir islemdir

    Bunun icin Java, Java8 den itibaren interface'lere sonradan body'si olan method eklenmesine izin vermistir

    bu methodlarin body'si olsa da Interface'in yapisi geregi bu methodlara concrete denmez
    Body'si olan bu methodlar istisna olarak kabul edilebilir

     */

    public void motor();
    public abstract void teker();


}

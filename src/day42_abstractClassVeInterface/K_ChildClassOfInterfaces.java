package day42_abstractClassVeInterface;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{
    /*
    Bir class'i bir interface'e child yapmak icin extends degil impelements keyword kullanilir
    implements dedikten sonra virgul koyarak istedigimiz kadar interfae ekleyebiliriz


     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);
        System.out.println(I02_Interfaces.SAYI);
        System.out.println(I02_Interfaces.ISIM);
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}

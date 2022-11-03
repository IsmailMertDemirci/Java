package day11_20.day15_overloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayi icin faktoriyel hesaplayip yazdiran bir method
        olusturun

        verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin faktoriyeli hesaplanamaz" uyarisi yazdirin, integerin max sinirini asmamasi lazim sayinin
         */
        int input=10;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {

        int faktoriyel=1;

        if (input<0 || input>20){
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz"); //int ust sinirini gecmemesi lazim tamsayinin
        }else if(input==0){
            System.out.println("O!=1'dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel degeri : "+ faktoriyel);
        }
    }
}

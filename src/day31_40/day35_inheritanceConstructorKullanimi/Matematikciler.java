package day31_40.day35_inheritanceConstructorKullanimi;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        //gizli super(); var, ogretmen parametresize gider
        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli Cons");
    }

    public static void main(String[] args) {

        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this() cons call icinde bulunulan class'taki constructorlari
    super() ise parent class'ta bulunan conslari cagirir

    this() veya super() parametre yapisina uygun bir cons bulamazsa Java CTE verir

    cons konusunda gordugumuz this. o class'taki instance variableleri refere ediyordu
    inheritance'da da super. vardir
    super. parent class'daki instance'lari refere eder
     */
}

package day31_40.day37_Overriding;

public class EToyota extends DAraba{

        void marka(){
                System.out.println("Markamiz Toyota");
                /*
                eger hem overridden hem de overriding methodun calismasini istersek ilk satira
                super.marka() yazabiliriz
                 */
        }

        void motor(){
                System.out.println("Toyota araclar Toyota marka motor kullanir");
        }

}

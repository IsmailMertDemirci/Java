package day31_40.day40_final;

public abstract class CAbstract {

    void toplama() {
        System.out.println("Bu method toplama yapar");

    }

    abstract void carpma();

    abstract void bolme();

    void cikarma(){
        System.out.println("Bu method cikarma yapar");
    }
    /*
    bir methodun basina abstract yazarsak bu methodun child classlar icin bir standart oldugunu declare etmis oluruz
    ve method body'sine ihtiyac kalmaz
     */
}


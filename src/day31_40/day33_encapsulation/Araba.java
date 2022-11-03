package day31_40.day33_encapsulation;

public class Araba {
    String marka ="Marka belirtilmedi";//markanin access modifieri default oldugundan package icinde kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli";//tum araclar elektrikli ise bu variable degismemeli
    //private yaptigimiz model ve yakit variablelerina erisimi yetkilendirelim
    //modele deger atanabilsin ama gorulemesin(setter)
    //yakit ise gorulebilsin ama yeni deger atanamasin(getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }


}

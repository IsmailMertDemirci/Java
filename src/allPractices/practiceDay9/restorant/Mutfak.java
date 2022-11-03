package allPractices.practiceDay9.restorant;

public class Mutfak {

public String yemekler="adanakebab, urfaciger, kusbasi,kusleme";

public String araSicak="yaylacorba, mercimekCorba, dugunCorba, corba";

public String tatlilar="baklava, sutlac,gullac, kazandibi, kunefe";

public String icecekler="ayran,salgam,kola";

    public Mutfak() {
    }

    public Mutfak(String adanakebab, String mercimekCorba, String kunefe, String salgam) {
        this.yemekler=adanakebab;
        this.araSicak=mercimekCorba;
        this.tatlilar=kunefe;
        this.icecekler=salgam;

    }


    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}

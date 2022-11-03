package allPractices.practiceDay9.restorant;

public class Musteri {

    public static void main(String[] args) {

        Mutfak menu = new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim = new Mutfak("adanakebab","mercimekCorba","kunefe","salgam");

        System.out.println("siparisim = " + siparisim);
    }

}

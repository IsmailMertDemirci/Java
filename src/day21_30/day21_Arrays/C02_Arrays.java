package day21_30.day21_Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        enUzunVeKisayiYazdir(isimler);
    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];//uzun ya da kisa farketmez degisecegi icin 0. indexi atadik
        String enKisaKelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) {//iki bagimsiz if yaptik uzun ve kisa kelime icin
            if (isimler[i].length() > enUzunKelime.length()) {//ayni uzunlukta iki kelime olursa > varken ilkini alir,
                enUzunKelime = isimler[i];                    // >= koyarsak ikincisini alir
            }

            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("Arraydaki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydaki en kisa kelime : " + enKisaKelime);
    }
}
